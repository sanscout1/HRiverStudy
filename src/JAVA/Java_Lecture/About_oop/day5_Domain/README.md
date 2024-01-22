# 도메인 모델

- ### 도메인
  - 구현 예정인 대상
  - 서비스할 정보에 대한 필드명들, 그룹핑한 클래스


- 카탈로그
    1. 고객에게 구매할 수 있는 상품 목록을 제공한다.

- 주문 
    1. 고객의 주문을 처리한다.
  - 혜택
    1. 쿠폰이나 특별할인 서비스를 제공한다.
  - 배송
    1. 고객에게 구매한 상품을 전달하는 여러가지 과정을 처리한다.
  

- ex) 한 하위 도메인은 다른 하위 도메인과 연동하여 완전한 기능 제공
  - 고객이 물건을 구매하면 주문,결제,배송,혜택


### 도메인 특징
- **모델의 구성 요소는 특정 도메인으로 한정될때 비로소 의미가 완전해 지기 때문에 하위 도메인 마다 별도로 모델을 만들수 있다.**

***

#### 주문 도메인 요구사항
- 요구사항에서 기능을 생각하여 만들어야 함


### ex)

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/domainRequirement01.png?raw=true" alt="--">



주문
(상품,가격,수량,구매량)
- 상품명 상품가격 구매개수 , 각 구매 항목에 구매 가격  
- 배송지 정보 지정하기  
- 출고 상태로 변경
- 담은 상품들 금액 더하기
- 출고 상태에 따라 주문 취소
- 고객 결제 완료 확인

```
public class Order {
    
    public void changeShipped(){}
    public void changeShippingInfo(ShippingInfo newShipping){}
    public void cancel(){}
    public void completePayment() {}

}
```
### 소스파일
* [`OrderLine`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day5_Domain/OrderLine.java)
* [`Order`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day5_Domain/Order.java)
* [`Money`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day5_Domain/Money.java)
* [`Shippinginfo`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day5_Domain/ShippingInfo.java)
* [`OrderState`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day5_Domain/OrderState.java)
* [`Product`](https://github.com/sanscout1/javaStudy/tree/main/src/Java_Lecture/About_oop/day5_Domain/Product.java)

***

## 유스케이스 다이어그램

- 누가 시스템을, 시스템은 사용자에게 무엇을 해야하며, 사용자와 상호작용을 위한 시스템이 제공해야 할 인터페이스는 무엇인가?
- 인터페이스 --> 사용자와 시스템이 상호작용하기 위한 기능들

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/usecase01.png?raw=true" width="70%" alt="--">

- 액터 : 시스템 외부의 존재, 이벤트를 시작하는 객체
- 유스케이스 : 시스템 내부에 해당되는 단위 기능 (function 단위) , 사용자 관점에서 시스템 모델링

### 액터와 유스케이스

#### 유스케이스 간의 관계
- 일반화 관계  (실선)
  - 상속 관계
  - 추상적인 엑터와 구체적인 엑터 사이에 관계를 맺어줌


- 포함(include) 관계 (점선)
  - 다른 유스케이스에서 기존 유스케이스를 사용
  - 같은 기능이 있는 다른 유스케이스가 반드시 수행되는 관계
  - 기준 유스케이스의 이벤트 (메소드 콜) 흐름에 영향을 줌
  


- 확장(extend) 관계 (점선)
  - 기존 유스케이스에 더 추가하여 사용
  - 상위 유스케이스로부터 특정 조건때 수행


#### 엑터와 유스케이스 관계
- 연관 관계 (실선)
  - 액터와 정보를 주고받는 유스케이스

#### 유스케이스 사이 관계
- 중복 관계 
  - 유스케이스의 흐름을 만들어 보고, 중복되는 케이스를 묶어본다
  - 중복 케이스를 그림과 같이 분리 한다.
  
<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/usecase02.png?raw=true" width="70%" alt="--">

***

### 클래스 다이어그램

- 클래스 이름, 속성, 메서드로 구성

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/classDiagram01.png?raw=true" width="70%" alt="--">

- public : +
- private : -
- protected : #


### 객체와 클래스 사이 관계 표현

- 객체를 생성하는 관계
  - 연관 관계 : 멤버 변수를 참조 (강한 결합)
  - 의존 관계 : 메서드로 참조 (약한 결합)

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/classDiagram02.png?raw=true" width="70%" alt="--">

- 실선에 각 클래스의 역할을 명시 하거나, 몇 대 몇 관계 인지 숫자로 표현


#### 다중성
  - 클래스 사이에 연관 관계 객체의 수가 1개 이상인 경우
  
<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/classDiagram03.png?raw=true" width="70%" alt="--">


#### 집합 관계의 복합 관계

- 집합 관계는 하나의 객체가 독립적인 객체 여러개로 구성되는 경우
- 한쪽의 객체가 없어도 다른 객체르 사용가능 (lifetime 독립적)
--------------------
- 복합 관계는 집합 관계보다 더 강한 관계로 구성 --> 단독 사용이 불가능, 반드시 슈퍼 클래스와 함께 사용
- 한쪽의 객체가 없으면 다른 객체도 사용 불가능 상태 (lifetime 종속적)
- 빈 네모 화살표가 집합, 검은색으로 칠해진 화살표가 복합

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/classDiagram05.png?raw=true" width="70%" alt="--">

// os에서 인터럽션이 올때, 어댑션 리스너쪽에서 자기가 기다리는 인터럽션에 반응하여 작업

#### 일반화 관계

- a kind of 관계 (grouping)

<img src="https://github.com/sanscout1/HRiverStudy/blob/main/src/picture/classDiagram06.png?raw=true" width="70%" alt="--">

#### 의존 관계
- 하나의 클래스가 다른 클래스를 사용해 영향을 미치는 관계
- 한 클래스의 메서드가 다른 클래스의 객체를 인자로 받아 메서드를 사용하는 경우
- 한 클래스의 메서드 내부에서 다른 클래스의 객체를 생성하여 그 메서드를 사용하는 경우
- 다른 클래스의 메서드가 또 다른 클래스의 객체를 반환하는 경우
- 일번 실선 화살표


***

- 정리 : 
- 연관 관계 (`일반 (상속의 느낌)`, `집합 (부품, 단독가능)`, `복합 (부품, 단독 불가능 슈퍼클래스 필요)`)   , 의존 관계
- 일반 (맴버로 객체를 소유 x), 연관 (맴버로 객체를 소유 o) 
- 집합(외부 생성 객체를 가져와 소유) , 복합 (내부에서 객체 생성해서 소유)










