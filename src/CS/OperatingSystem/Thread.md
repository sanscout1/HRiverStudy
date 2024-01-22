# 쓰레드 
- 한 프로세스안에서 동시에 여러 작업들을 수행할 수 있게 해주는 프로세스 안의 작은 프로세스
-  `쓰레드 ID`, `프로그램 카운터(Program Counter, PC)`, `레지스터 집합(Register Set)`, `스택(Stack)`으로 구성
- 같은 프로세스에 속한 다른 쓰레드와 `코드(code)`, `데이터(data) 영역`, `열린 파일`이나 신호와 같은 운영체제의 자원들을 공유
![Thread03.png](..%2F..%2Fpicture%2FThread03.png)

## 쓰레드 장점
- 응답성(Responsiveness) : 응용 프로그램이 긴 작업을 수행하더라도 프로그램의 수행이 계속되는 것을 허용함
- 자원 공유(Resource Sharing) : 본인이 속한 프로세스의 자원(code,data,files)들과 메모리를 공유가 가능
- 경제성(Economy) : 로세스 생성을 위해서 메모리와 자원을 할당하는 것은 비용이 많이 듭니다. 쓰레드는 프로세스 자원을 공유하기 때문에 쓰레드를 생성하고 문맥 교환(Context Switching)하는 것이 더 비용이 쌉니다.
- 다중 처리기 구조의 활용(Utilization of multiprocessor architectures) :  다중 CPU에서 다중 쓰레딩을 수행하면 병렬성이 증가

## 다중 쓰레드 모델

### 사용자 쓰레드와 커널 쓰레드의 관계
- 사용자 쓰레드는 커널 위에서 지원되며 커널의 개입 없이 관리
- 커널 쓰레드는 운영체제에 의해 직접 지원되고 관리

### 사용자 쓰레드와 커널 쓰레드 간에는 연관 관계
- 다대일 모델(Many-to-One Model)
  - 여러개의 사용자 수준 쓰레드를 하나의 커널 쓰레드에 매핑
  - 하나의 사용자 쓰레드가 블록되면 전체 프로세스가 봉쇄됨
  - 다중 쓰레드가 다중 처리기에서 수행되도 병렬로 작동 불가능
  
![thread04.png](..%2F..%2Fpicture%2Fthread04.png)
<br>
  
  
- 일대일 모델(One-to-One Model)
  - 각각의 사용자 쓰레드가 각각의 커널 쓰레드에 매핑
  - 하나의 쓰레드가 블록되어도 다른 쓰레드가 수행 가능하기 때문에 많은 병렬성 제공
  - 다중 처리기에서 다중 쓰레드가 병렬로 수행되는 것을 허용
  - 단점 : 사용자 쓰레드를 생성할 때 커널 쓰레드도 생성되기 때문에 응용 프로그램의 성능이 저하됨
![Thread05.png](..%2F..%2Fpicture%2FThread05.png)

- 다대다 모델(Many-to-Many Model)
  - 여러 개의 사용자 수준 쓰레드를 그보다 작거나 같은 수의 커널 쓰레드로 매핑함
  - 하나의 사용자 쓰레드가 블록되어도 다른 사용자 쓰레드를 실행 시킬수 있음 (병렬성)
  - 개발자가 필요한 만큼의 사용자 쓰레드를 생성할 수 있음
  - 
![thread06.png](..%2F..%2Fpicture%2Fthread06.png)

- 다대다 모델의 변형, 두 수준 모델(Two-Level Model)
  - 두 수준 모델은 다대다 모델의 변형으로 많은 사용자 쓰레드를 적거나 같은 수의 커널 쓰레드로 매핑시키는 것을 유지하지만 하나의 사용자 쓰레드가 하나의 커널 쓰레드에 종속되도록 합니다

<br>
<br>

## 쓰레드 라이브러리
- 커널 지원없이 사용자 공간에서만 라이브러리를 제공
- 운영체제에 의해 지원되는 커널 수준 라이브러리를 구현

### POSIX Pthread
- Solaris, Linux, Mac OS 및 Tru64 UUNIX를 포함한 많은 시스템들이 Pthread 명세를 구현
```agsl
// the data shared by the threads
int sum;

// thread call this function
// java api에서는 run method
void * runner(void* param);

int main(int argc, char* argv[])
{
    pthread_t tid; // thread identifier
    pthread_attr_t attr;    // thread attributes

    if(argc!=2)
    {
        fprintf(stderr, "usage: a.out <integer value>\n");
        return -1;
    }
    if(atoi(argv[1])<0)
    {
        fprintf(stderr,"%d must be >= 0\n",atoi(argv[1]));
        return -1;
    }

    pthread_attr_init(&attr);    // attr 초기화
    pthread_create(&tid, &attr, runner, argv[1]);   // 쓰레드 생성
    pthread_join(tid, NULL);    // tid 쓰레드 대기

    printf("sum = %d\n", sum);
}

void *runner(void* param)
{
    int i, upper = atoi(param);
    sum = 0;
    for(i=0; i<=upper; i++)
    {
        sum += i;
    }
    pthread_exit(0);
}
```

- pthread_t tid : 생성할 쓰레드를 위한 식별자 선언, 각각의 쓰레드는 스택의 크기와 스케줄링 정보를 포함한 속성의 집합을 소유
- pthread_attr_t attr : 쓰레드를 위한 속성을 나타냄
- pthread_attr_init(&attr) : attr이 가리키는 주소에 속성을 지정함, 여기서 default 속성을 지정함
- pthread_create(&tid, &attr, runner, argv[1]) : 식별자, 속성, 실행할 함수, 실행할 함수의 매개변수를 지정하여 쓰레드를 생성함

### Java 쓰레드
- Thread 클래스를 상속받아 run() 메서드를 오버라이드 하는 방법
- Runnable 인터페이스를 구현하는 클래스를 정의하고 run 메서드를 구현하는 방법
```agsl
public class MyThread1 extends Thread{

	@Override
	public void run() {
		try 
		{
			while(true)
			{
				System.out.println("Hello, Thread!");
				Thread.sleep(500);
			}
		}
		catch(InterruptedException ie) {
			System.out.println("I'm interruptedException");
		}
	}
	
	public static void main(String[] args)
	{
		MyThread1 thread = new MyThread1();
		thread.start();
		System.out.println("Hello, my child");
	}
	
}
```

#### JVM(Java Virtual Machine)과 호스트 운영체제
- JVM에서 관리하는 Java 쓰레드 라이브러리로 생성한 쓰레드들은 각 운영체제에서 사용하는 다중 쓰레드 모델에 맞추어서 매핑되도록 수행합니다
- ava 프로그램이 JVM을 지원하는 어떠한 플랫폼에서도 작동할 수 있도록 하는 일관되고 추상적인 환경을 제공
***
## 쓰레드 이슈
- 다중 쓰레드 프로그램을 사용할때 고려해야할 점
### 1. 쓰레드의 fork() 및 exec() 시스템 콜 호출
- 다중 쓰레드 프로세스의 환경에서 한 쓰레드가 `fork()`를 수행하면
  1. 부모 프로세스가 사용하는 모든 쓰레드를 복사함
  2. 부모 프로세스에서 fork()를 호출한 쓰레드만 복사함
  - 응용프로그램에게 달려 있음
-  `exec()` 시스템 콜을 호출하면 별도의 프로세스 공간을 생성하지 않고 exec()의 매개변수로 지정한 프로세스로 대체
- exec() 실행의 결과로 생성되는 새로운 프로세스는 없고, exec()를 호출한 프로세스의 PID가 그대로 새로운 프로세스에 적용이 되며, exec()를 호출한 프로세스는 새로운 프로세스에 의해 덮어 쓰여지게 됩니다.
  

#### 만약 어떤 프로세스안의 쓰레드가 fork()를 호출한 다음 exec()를 호출한다면 어떻게 설계하는게 좋은가?
1. case 1 : 부모 프로세스가 사용하는 모든 쓰레드를 복사함
   - 결과 : 모든 쓰레드를 복사하고 exec() 호출하여 새로운 프로세스로 대체됨
2. case 2 : 부모 프로세스에서 fork()를 호출한 쓰레드만 복사함
   - 결과 : fork()를 호출한 쓰레드만 복사된 다음 exec()를 호출하여 새로운 프로세스로 대체됨

-  fork()할때 부모 프로세스의 모든 쓰레드를 복사할지 말지에 대해서 고려해야 합니다

### 2. 쓰레드 취소
- 쓰레드가 끝나기 전에 그것을 강제 종료시키는 행위
- 취소되어야 할 쓰레드를 `목적 쓰레드(target thread)`

- 목적 쓰레드 취소의 두가지 방식
  1. 비동기식 취소(asynchronous cancellation) : 한 쓰레드가 즉시 목적 쓰레드를 강제 종료
     - 적 쓰레드들이 갑자기 강제 종료가 된다면 할당된 자원들이 올바르게 해제되지 않을 수 있다.
     - 목적 쓰레드가 다른 쓰레드와 공유하는 자료 구조를 갱신하는 도중에 취소 요청이 올때 문제가 발생할 수 있습니다
     - 시스템 자원을 다 사용 가능한 상태로 만들지 못할 수 도 있기 때문에 목적 쓰레드의 비동기식 취소 방식은 문제가 될 수 있습니다.
  2. 지연 취소(deterred cancellation) : 목적 쓰레드가 주기적으로 자신이 강제 종료되어야 할 시기를 점검함.
     - 목적 쓰레드가 취소 에정이라고 표시하지만 실제 취소는 목적 쓰레드가 취소 여부를 결정하기 위하여 플래그를 검사한 이후에야 일어납니다
     - 쓰레드들은 자신이 취소되어도 안전하다고 판단되는 시점에 취소 여부를 검사할 수 있습니다 `취소점`

### 3. 쓰레드의 신호처리

- 신호(동기식 신호/비동기식 신호)가 발생하면 어느 쓰레드에게 신호를 전달해야하는가를 고려해야합니다.
- 신호는 운영체제에서 프로세스에게 어떤 사건이 일어났음을 알려주기 위해 사용되는 것
  - 동기식 신호 : 실행중인 프로그램이 불법적인 메모리 접근, 0으로 나누기 등의 행위를 하였을때 발생함. 동기식 신호는 신호를 발생시킨 연산을 수행한 동일한 프로세스에게 전달됨.
  - 비동기식 신호 : 프로세스 외부로부터 신호가 발생하여 프로세스에게 신호를 순서를 무시하고 전달하는 신호입니다. 

#### 신호 처리기의 종류

1. 디폴트 신호 처리기 : 모든 신호마다 커널에 의해 실행되는 처리기
2. 사용자 정의 신호 처리기 : 특정 신호에 사용자가 정의한 방식으로 처리되는 처리기

#### 왜 다중 쓰레드 프로세스는 신호 처리를 고려해야 하는가?
- 문제는 어느 쓰레드에게 신호를 전달해야 하는가? 입니다.

#### 다중 쓰레드 프로세스에서 신호 발생시 전달 쓰레드 선택의 경우
1. 신호가 적용될 쓰레드에게 전달 (단일)   (동기식 신호)
2. 모든 쓰레드에게 전달   (비동기식 신호)
3. 몇몇 쓰레드들에게만 선택적으로 전달  (다중 쓰레드 UNIX)
4. 특정 쓰레드가 모든 신호를 전달받도록 지정 (비동기식 프로시저 호출)

#### 비동기식 프로시저 호출이란 무엇인가?
- 사용자 쓰레드들이 특정 사건의 발생을 전달받을때 호출될 함수를 지정할 수 있게하는 것입니다

####  신호를 받았을때 어느 쓰레드(단일/전부/선택적)에게 전달할 것인지, 신호를 전달받으면 어떻게 처리(무시/강제종료)할 것인지 고려해야 합니다.


### 4. 쓰레드 풀
- 첫번째 문제는 서비스를 수행할때마다 쓰레드를 생성하는데 소요되는 시간입니다. 
- 두번째 문제는 모든 요청마다 새 쓰레드를 생성하여 서비스한다면 시스템에서 동시에 실행할 수 있는 최대 쓰레드의 한계수를 정해야 합니다
  - 쓰레드의 개수를 무한정 만들면 CPU 시간, 메모리 공간같은 시스템 자원이 고갈될 것

- 프로세스를 생성할 때 아예 일정한 수의 쓰레드들을 미리 풀(pool)로 만들어 두는 것
    - 미리 생성된 쓰레드들이 풀에 있다가 요청이 들어오면 풀에 있는 쓰레드 하나가 서비스를 하고 다시 풀에 복귀하는 개념입니다. 만약 풀에 쓰레드가 없다면 서버는 풀에 쓰레드가 생길때까지 대기하여야 합니다.

#### 쓰레드 풀의 장점
1. 새 쓰레드를 만들어 주기보다 기존 쓰레드로 서비스해 주는 것이 빠름
2. 쓰레드 풀은 임의 시각에 존재할 쓰레드 개수에 제한을 둠. 이러한 제한은 많은 수의 쓰레드를 병렬 처리할 수 없는 시스템에 도움을 줌

```agsl
public class ThreadPool implements Runnable {
	private String threadName;

	public ThreadPool(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"의"+threadName+"이 시작되었습니다.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"가 종료되었습니다.");
	}

	@Override
	public String toString() {
		return this.threadName;
	}

}


public class Driver {

	public static void main(String[] args) throws InterruptedException {
		// 5개의 pool을 고정함
		ExecutorService pool = Executors.newFixedThreadPool(5);
		
		IntStream.range(1, 10).forEach(i->{
			Runnable thread = new ThreadPool("SleepThread"+i);
			pool.execute(thread);
		});
		
		// ExecutorService 종료
		pool.shutdown();
		
		// ExecutorService가 종료될때까지 대기
		while(!pool.isTerminated())
		{
			
		}
		
		System.out.println("모든 Thread가 종료되었습니다.");
		
	}

}
```
<br>
<br>

### 5. 쓰레드별 데이터
- 다중 쓰레드 프로그래밍의 큰 장점중 하나로는 프로세스의 자원을 각각의 쓰레드들이 공유한다는 점
- #### 쓰레드만이 가지고 있는 자원을 쓰레드별 데이터

### 6. 스케줄러 활성화
- 사용자 쓰레드 라이브러리와 커널 쓰레드간의 통신을 하는 방법입니다
- 쓰레드 라이브러리와 커널간의 통신 문제 해결
- `LWP(경량 프로세스)`는 사용자 쓰레드와 커널 쓰레드를 연결해주는 커널에서 응용 프로그램에 제공하는 자료구조


***

https://yonghwankim-dev.tistory.com/231 정리할것


