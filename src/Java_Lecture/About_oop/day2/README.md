### 인터페이스 기본 코드 및 Builder Pattern

#### 간단 개념 정리

- 오버라이딩 : 메서드 재정의
- super : 부모 클래스의 생성자
- final : 더 이상 확장이 불가능함을 알리는 예약어
  - 메서드 final 은 오버라이드를 막음
  - class final 상속을 못하게 막음
  
- 추상 클래스
    - 공통된 부분들만 구현하고, 공통으로 정의하지 않는 부분들에 abstract라는 예약어를 사용한 미완성 클래스



***


### Builder Pattern

* 복잡한 객체의 생성과정과 표현방법을 분리해서 다양한 인스턴스를 만드는 생성 패턴이다.
* 생성자에 들어갈 매개변수를 메소드로 하나하나 받아들이고 마지막에 통합빌드하여 객체를 생성하는 방법

> https://johngrib.github.io/wiki/pattern/builder/ 

> https://readystory.tistory.com/121

 