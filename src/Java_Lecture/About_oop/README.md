# About\_oop

---
* [`Object필드 활용`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day3/ex1)
* [`인터페이스 기본 코드 및 Builder Pattern`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day2)
* [`도메인 모델, 유스케이스`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day5_Domain)
* [`추상클래스의 이해`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day6_abstract)
* [`인터페이스 활용 코드`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day_interface)


-- 목차
1. UML
2. 객체 지향 모델링
3. 객체 지향 프로그래밍
4. 생성자
5. 상속
6. 추상화

---
#### UML(Unified Modeling Language)

* 시각화 —오류 없는 의사소통
* 명세화 —고유의 특성
* 구축 —다양한 프로그래밍 언어 표현
* 문서화 —자동 문서화 가능
* 시스템 개발을 위한 시각적인 설계 표기
* 모델링 -> 의뢰자의 요구에 맞도록 쉡게 수정해서 결과적으로 유지보수 기간을 줄여 생산성을 높이는데 목적이 있다.
  * 필요한 경우 --> 협업이 필요한 경우, 다양한 관점의 설계도가 있어야 하는 경우, 개인이 제어 할 수 없는 작업의 경우
  * UML을 이용하여 설계도를 만든다.

#### Object-Oriented Modeling 객체 지향 모델링

* 시스템을 객체의 관점으로 봐야 한다.
* 객체지향시스템을 가시화, 명세화 하고 문서화 하는 것이 목적
  * 자료 구조(데이터)를 중심으로 객체 를 설계한 다음 이들의 흐름을 설계하는 방식
  * 객체간의 메세지(인터페이스)
  * 클래스 --> 현실에 있는 것을 개념적으로 모델링 한 것
  * 객체 --> 클래스를 인스턴스, 현실에 존재하게 구체화 한 것

***

#### Object-Oriented Programming

* 부품 --> 부품 조립 --> 완성품
* set을 이용한 객체생성을 하여 약한 결합을 추구함(call-by-reference)
* 단일 부모 자식 상속 관계는 자식이 부모에게 필요한 것을 요청하는 것 (그래서 그림에 화살표 방향이 자식에서 부모로 향하게)
* 집합 관계: 완성품과 부품의 관계
* 사용 관계: 다른 객체의 필드를 읽고 변경하거나 메소드를 호출하는 관계
* 상속 관계: 부모와 자식 관계. 필드, 메소드를 물려받음(확장성)

#### 객체지향 프로그래밍 특징

1. 캡슐화

* 객체의 데이터(필드), 동작(메소드)를 하나로 묶고 실제 구현 내용을 외부에 감추는 것

2. 상속

* 코드의 재사용 (중복 코딩 최소화), 유지보수, 부모 객체가 본인의 필드 메소드를 자식객체가 사용할수 있도록 클래스 설계한 것.

3. 다형성

- 어떤 객체의 속성이나 기능이 그 맥락에 따라 다른 역할을 수행할수 있는 객체 지향의 특성
* 사용방법은 동일하지만, 실행 결과가 다양하게 나오는 성질 다형성을 구현 하기 위해서 자동타입변환(프로모션), 재정의(오버라이딩)
- 다형성을 제공 하기 위한 기술 (추상클래스, 인터페이스)
***

## 생성자

* &#x20;객체 생성시 힙에는 맴버필드만 저장되어있음
* &#x20;메서드는 호출할때만 찾아가서 가져오는 구조

### 생성자 오버로딩

* 생성자 이름이 같지만 매개변수가 다른 여러 생성자를 정의하는 것


***


## 상속

* 상속은 다른 클래스 간의 관계를 설정하고 계층적 순서로 정보를 관리하며 코드를 재사용하는 데 도움됨
* 클래스 간의 관계를 더 잘 이해할 수 있고 프로그램 구조를 더욱 조직화할 수 있기 때문에코드의 가독성과 해석 가능성이 향상됨

  - 코드의 재사용, 계층적 순서

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/extends01.png?raw=true" width="70%" alt="--">


* 다중 상속 허용하지 않음. extends 뒤에 하나의 부모 클래스만 상속
* 부모 자식 : Is - A 관계 (extends, implements)

* 부모 A, 자식 B 가 있을 때, `A a = new B();` --> b만 가지고 있는 것을 이용이 불가능

### 오버라이딩
- 이름은 같고 내용 재정의
- 부모의 함수의 이름과 동일 하게 자식에게 지어주고, 내용을 변경해서 사용가능

ex) A 부모에 aa() 가 있을 때, B 자식에 aa() 함수명에 내용 다르게 정의
  - A.aa() 와 B.aa() 는 다르게 정의가 가능한 것

- #### (외우자) 만약 `A a = new B()` 했더라도 a.aa() 하면 위에 내용대로면 A의 aa()를 출력해야 할 거 같지만, 여기서는 B의 aa()를 출력함
- 메서드 오버라이딩의 특수한 기능임

---

## 추상화

- 불필요한 정보를 숨기고 효율적으로 코드 짜기 위하여 구현하고자 하는 부분의 범위 축소하는 것
- 코드의 중복을 막고 재사용성을 높일 수 있음, 응용 프로그램이나 프로그램의 보안에 도움이 됨


#### 추상화 유형
- 데이터 추상화 : 자료형을 만들고 구현을 숨기는 것
- 제어추상화 : 작업의 단위 정의를 하고, 재사용 하는 것. 반복되는 코드를 수집하여 하나의 단위로 노출 (오버로딩,오버라이딩)

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/abstract01.png?raw=true" width="70%" alt="--">


- 추상클래스를 상속 받는 다면, 추상 메소드를 반드시 정의 해야함
- 상속 받는 자식 클래스가 추상 클래스라면 정의 안해도 됨

## 인터페이스

- 추상 클래스는 추상 메서드와 일반 메서드를 포함할 수 있지만, 인터페이스는 추상메서드만 포함할 수 있음


- 다중 상속을 구현할 수 있음
- 두 객체를 연결하는 역할
- default, public 가능
- 인터페이스와 추상클래스는 기준 및 표준이 되기 위하여 정의를 하지 않고 기준만 잡아줌
- 유지보수가 편리 (코드에 변경이 있을 때, 영향을 받는 부분을 최소화)

### 인터페이스 사용 이유
- 완전한 추상화 구현 가능
- 다중 상속 구현 가능
- 느슨한 결합 형성 가능

```agsl
rc = new Television();  
rc1 = new Audio();
rc.turnOn();
rc1.turnOn();
```
- 동일 인터페이스로 참조형을 결정하여 생성한 객체들은 생성한 클래스가 무엇이냐에 따라 함수 호출 가능
- #### **인터페이스로 구현한 모든 객체들은 모두 인터페이스로 담을 수 있다**


### 인터페이스에서 사용 가능한 것들

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/interface01.png?raw=true" width="70%" alt="--">

* [`인터페이스 활용 코드`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day_interface)

#### 인터페이스 선언 종류

- 상수 : public static final --> 상수는 구현객체와 상관 없는 인터페이스 맴버로 바로 접근해서 읽을 수 있다.
- 추상 메소드 : 바디가 없는 메소드 (메소드 선언부만 작성)
- 디폴트 메소드 (default method) :  인터페이스에서 완전한 실행코드를 가진 유일한 메소드, 재정의 시 default 키워드 삭제
- 정적 메소드 : (static 메소드)  구현 객체가 없어도 인터페이스 호출만으로 사용 가능

=========================== public =============================
- private 메소드 : 인터페이스에서 외부접근 막고 싶을 떄 사용
  - 디폴트와 정적메소드들의 중복코드를 줄이기 위해
    - private 메소드 
    - private static 메소드

- static은 static 끼리 사용가능한 점 알아 둘 것
- 인터페이스는 super 사용 불가 --> 객체의 주소값을 불러오는 super가 불러올 주소값이 없기 떄문이다.

#### 다중 상속
- 인터페이스 두 개를 동시 적용 하고 싶다면, 두 인터페이스를 새로운 하나의 인터페이스에서 extend 하여 implements 하면 된다.
* [`다중 인터페이스`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day_interface/interExample)



---




### 싱글톤

> https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%EC%8B%B1%EA%B8%80%ED%86%A4Singleton-%ED%8C%A8%ED%84%B4-%EA%BC%BC%EA%BC%BC%ED%95%98%EA%B2%8C-%EC%95%8C%EC%95%84%EB%B3%B4%EC%9E%90