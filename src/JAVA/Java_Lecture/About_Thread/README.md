# 쓰레드

### OS
- 시스템(하드웨어)의 원할한 운영과 자원 관리를 효율적으로 해주는 소프트웨어
- 프로세스의 상태를 감시
- 프로세스 상태를 기반 프로세스 스케쥴링함
  - 프로세스를 관리하고 제어
    - 생성(new) --- (Admitted) ----▷ 준비 (Ready) : 프로세스 생성을 승인 받음
    - 준비(Ready,Runnable) --- Dispatch ---▷ 실행 (Running) : 준비 상태에 있는 여러 프로세스 중 하나가 스케쥴러에 의해 실행
    - 실행 (Running) --- interrupt ---▷ 준비(Ready,Runnable) : timeout, 이벤트가 발생해서 현재 실행중인 프로세스나 쓰레드가 준비상태로 전환
    - 실행 (Running) ---▷ waiting : 실행중인 프로세스가 입출력이나 이벤트에 의해 대기해야 하는 경우, 입출력이나 이벤트가 끝날떄 까지 대기해야 하는 경우
    - waiting ---▷ 준비(Ready,Runnable) : 다시 준비 상태로 만들어서 스케쥴러에 의해 선택될 수 있도록 상태전환

#### 멀티 태스킹 : 두가지 이상의 작업을 동시에 처리 , os가 멀티프로세스를 생성해서 처리
- 멀티 스레드: 프로그램 내부의 멀티태스킹
- 스레드 : 코드의 실행흐름, 프로그램 내부에 존재
#### 멀티 프로세스: 프로그램 단위의 멀티 태스킹
- 프로세스 : os에서 실행중인 프로그램
  - 프로그램 + 프로세스제어블록(PCB), 프로세스는 독립된 메모리 영역 할당
  - 프로세스는 code, data, heap stack 영역을 가진다.
  - 프로세스에는 각 쓰레드 별로 고유의 스택영역을 가진다.
  - 자바에서는 프로세스는 존재하지 않고 쓰레드만 존재
### 프로세스 상태 전이
  - 프로세스가 실행하는 동안 상태가 OS에 의해 변경되는 것
<br>
<br>
<br>
***
### 자바 쓰레드 생성 방법
- 쓰레드는 하나만 상속되지만 runnable은 인터페이스라 다중 상속가능
1. Thread 클래스 
   1. java.lang.Thread 클래스로부터 작업 스레드 객체를 직접 생성
        - Thread thread = new Thread(Runnable target);
            - Runnable 쓰레드가 작업을 실행할 때 사용하는 인터페이스
            - 구현 클래스는 run() 을 오버라이딩을 하여 스레드가 실행할 코드 작성
            - [**쓰레드 기본 예제**](BeepPrintThread.java)
            
        <br>
   2. java.lang.Thread 클래스를 상속받아 생성
   
    <br><br><br>


   - [`쓰레드 상태 종류`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Thread.State.html)
        - Runnable (실행대기)
        - 실행 (state 없음)
        - 일시정지(blocked, waiting, timed_waiting)
     - Starvation 은 ready 상태에서 무한 대기
     - Deadlock 은 asleep 상태에서 무한 대기
    <br><br>
   - 쓰레드 정지 관련 메서드
     
 ![therad01.png](..%2F..%2F..%2Fpicture%2Ftherad01.png)

2. Runnable 인터페이스 : run();


### 동기화 메소드, 동기화 블록
- 스레드 작업이 끝날 때까지 객체에 잠금을 걸어 스레드가 사용중인 객체를 다른 스레드가 변경할 수 없게함 
- 인스턴스와 메서드에 `sychronized` 붙이기
- 동기화 메소드 나 해당 영역 실행시 즉시 잠금 일어나고, 실행 끝나면 잠금 풀림
- 객체 데이터에 공유할 예정인 곳에는 모두 `sychronized` 추가 해야하며, 안하면 비정상 접근 발생

![thread02.png](..%2F..%2F..%2Fpicture%2Fthread02.png)


- 예제 코드

### [**ThreadInterrupt**](ThreadInterrupt.java)

### [**동기화 예제**](calculatorThread%2FCalculatorThreadEx.java)


