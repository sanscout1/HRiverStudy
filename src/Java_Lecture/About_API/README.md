
# JAVA 중요 API


## 예외 처리

1. 예외와 에러
   - 에러 : 개발자의 수정 가능 범주 밖에서 발생한 문제들
   - 예외 : 모든 예외 클래스는 Throwable 추상클래스에서 시작 (처리 위치 : 메소드)
     - 일반 예외 : 컴파일러가 검사, 체크 exception (IOException , ClassNotFound, Interrupted)
       - 컴파일 하기 전에 반드시 throws 든 try-catch 든 예외처리를 해줘야 실행이 가능한 예외
     - 실행 예외 : 실행중 발생 하는 예외, 개발자가 잡아줘야 하는 에러 , 컴파일러가 검사 하지 않음, uncheck exception (Runtime , NumberFormat, ArrayIndexOutOfBounds)
       - 하위 예외들은 언체크 예외이므로 필요 시에 throws 나 try-catch로 잡아준다.
   - 예외처리를 통하여 정상적인 종료를 하기 때문에 실행을 유지 하여 문제점을 확인 할 수 있음
   - 불완전 종료를 하면 문제점 파악을 할 수 없음
   - trycatch-finally 을 통해 예외 처리
   - (자바는 표준 라이브러리 제공으로 불필요한 작업을 최소화 하여서 좋음)
   
***
***
- ThrowsException 
  - 함수에서 발생하는 예외 처리는 throws 를 통해 main 문에 있는 예외 작성 한 곳으로 이동 하게 한다.
  - throws 예외 처리를 미루는 것 : 예외를 호출한 곳으로 보내주는 것
  

- FinallyTest
  - finally 구문은 return, break; 다 무시하고 실행한다 // 그래서 여기서 무조건 return 값이 1이 나온다.

***
***

### 사용자 정의 예외

- throw 키워드와 함께 사용 (예외 객체 생성)
- throw 와 throws ( 예외를 미루는 것) 는 다른것
- 사용자가 새로운 예외 클래스를 만들어서 이용할 수 있는 방법
- toString() 메서드를 재정의하여 catch 블록에서 사용자 정의 메시지를 표시

- 사용자 정의를 포함한 다른 예외 클래스도 throw new 가능하다

https://devfalledinmac.tistory.com/14  
//