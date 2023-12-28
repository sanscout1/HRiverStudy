
# JAVA 중요 API


## 예외 처리

1. 예외와 에러
   - 에러 : 개발자의 수정 가능 범주 밖에서 발생한 문제들
   - 예외 : 모든 예외 클래스는 Throwable 추상클래스에서 시작
     - 일반 예외 : 컴파일러가 검사, 체크 exception (IOException , ClassNotFound, Interrupted)
       - 컴파일 하기 전에 반드시 throws 든 try-catch 든 예외처리를 해줘야 실행이 가능한 예외
     - 실행 예외 : 실행중 발생 하는 예외 , 컴파일러가 검사 하지 않음, uncheck exception (Runtime , NumberFormat, ArrayIndexOutOfBounds)
       - 하위 예외들은 언체크 예외이므로 필요 시에 throws 나 try-catch로 잡아준다.
   - 예외처리를 통하여 정상적인 종료를 하기 때문에 실행을 유지 하여 문제점을 확인 할 수 있음
   - 불완전 종료를 하면 문제점 파악을 할 수 없음
   - trycatch-finally 을 통해 예외 처리
   - (자바는 표준 라이브러리 제공으로 불필요한 작업을 최소화 하여서 좋음)
   




