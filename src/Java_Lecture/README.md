# JAVA

- [`기본 문법`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_basic_grammar)
- [`객체 지향 및 UML`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop)
- [`자바 중요 API`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_API)
- [`자바 Collection`](About_Collection)
- [`람다`](About_Lamda)
- [`스트림`](About_Stream)

## JVM
- os 독립적인 개발 가능
- 자동으로 메모리를 관리 
- `javac 컴파일러` 클래스파일 생성 하여 jvm 에서 독립적으로 처리하기 때문에 시스템에 종속적이지 않다 (javac 명령어는 텍스트 파일로 작성된 java 파일을 bytecode로 컴파일 합니다. 컴파일된 파일은'.class' 파일로 저장됩니다)
- `java.exe` 실행 (javac 명령어로 컴파일한 '.class' 파일을 실행시킬 수 있습니다.) : JVM 에 있는 classLoadter 가 불러옴

## 변수와 타입

- 클래스(class): 사물의 특성을 소프트웨어적으로 추상화하여 모델링 한 것으로 객체를 만들 수 있는 틀(Template)로써 오브젝트의 정적인 상태를 나타냅니다.
- 인스턴스 : 클래스의 내용을 메모리에 할당 한 것.
<br>
<br>
- short, char 2byte
- int 4byte
- long 8byte
- boolean 1byte
  <br>
  <br>
- 변수 초기값

![image (1) (1).png](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F271DBF3A5636DA3608)

  - 참조형 변수 사이즈 `4byte`
  - double (8byte) 이 float (4byte) 보다 `정밀도`가 높다고 표현 (소수점 단위로 더 아래 표현 가능해서)
  - & | `한 개만` 쓰면 비트 연산자
  - byte 는 char 로 `자동 변환 불가`
  - %1$d %2$d —> 첫 번째로 쓴 정수, 두 번째로 쓴 정수 출력 방법

## 자동 타입 변환
- 작은 타입을 큰 타입에 대입 할때

### 캐스팅 연산자로 강제 변환
- 큰 허용 범위 타입을 작은 허용 타입에 대입 ,, 괄호 이용

### String 타입 변환하기
- parseInt ....
- int -> String.valueOf(int)

---

## 참조 타입

- 참조값 : 생성된 객체가 저장된 메모리 공간의 주소
![referenceType01.png](..%2Fpicture%2FreferenceType01.png)
- 클래스 데이터를 저장하기 위한 타입
- 모든 클래스는 Object 에 상속이 기본
- 클래스와 객체의 차이는 실존 차이 (메모리 할당 차이)

![Untitled (3).png](https://goldenrabbit.co.kr/wp-content/uploads/2021/11/%E1%84%8C%E1%85%A1%E1%84%87%E1%85%A1-%E1%84%86%E1%85%A6%E1%84%86%E1%85%A9%E1%84%85%E1%85%B5-%E1%84%86%E1%85%A9%E1%84%83%E1%85%A6%E1%86%AF_02.png)

- 클래스가 실체하면 instance (메모리 할당 한 상태)
- 메소드 영역(스태틱 영역) —> 스레드가 정지 될 때까지 유지 되는 영역
- 실제 데이터들은 힙과 메소드영역에 있고, 사용 할 때 스레드 스택영역에 들어왔다 나감.
- 메소드 영역의 클래스를 new 를 통해 객체 생성을 스레드에서 하여 힙 영역에 실제 데이터를 저장
- 상속은 힙 영역안에서 해결, 인터페이스는 힙영역의 객체를 스레드로 가져와서 처리
- JVM 은 String 의 경우 같은 값의 변수가 들어오는지 실시간 검사를 (검사풀, 검사메소드 뭐있다는데 )하다가 같으면 같은 메모리 주소값을 활용한다.

### 매소드(static) 영역
- 바이트코드(클래스파일)을 읽어 저장하는 영역
- 클래스 별 상수, 정적필드, 메소드 코드, 생성자 코드 저장
- static 을 명시하면 한번만 생성해서 계속 이용 —> 정적 필드 (다른 함수나 메인이 같은 static 영역이면 사용 가능하다. )

### Heap(동적 메모리) 영역
- 객체가 생성되는 영역 (객체의 데이터 저장)
- 객체의 번지는 메소드 영역 과 스택영역의 상수와 변수가 참조

### 스택 영역
- 메소드 를 호출할때마다 생성되는 Frame이 저장되는 영역
- 메소드 호출이 끝나면 해당 프레임은 삭제된다.  pop
- 프레임 내부에는 로컬변수 스택이 생성되어 운영된다.
- 로컬변수 스택에서 기본타입변수 와 참조타입 변수가 생성되고 제거된다.
---

## 배열

```
     	System.out.println(array1.toString());  //16진법 주소 출력
        System.out.println(array1.toString()==array2.toString());
			 // 값은 같지만, 주소값을 비교해서 false 출력
        //System.out.println(array1.hashCode()==array2.hashCode());
        //System.out.println(Arrays.hashCode(array1) == Arrays.hashCode(array2)); 
        // 주소값을 정수값으로 바꿔주는 hashcode 함수
        System.out.println(array1==array2);
        System.out.println(array1.equals(array2)); // 배열에서는 주소값비교임
				//String 같은 참조형 다른애는 값비교 맞음
        System.out.println(array2 == array3);
        // 주소값 비교


        System.out.println(Arrays.equals(array1, array2)); // 값비교
	int a = 3;
	int b = a; // 변수는 값복사
	String kind1 = "자동차";
	String kind2 = kind1;   // 주소값 복사
```
- 변수에 변수 대입은 값복사 지만, 참조 변수에서는 주소값 복사 함


- `System.out.println(System.identityHashCode(array1));`
    - `System.identityHashCode()` 10진법으로 주소출력
    - `System.*out*.println(array1.toString());   //776ec8df` -- `toString()` 16진법 주소 출력


---


