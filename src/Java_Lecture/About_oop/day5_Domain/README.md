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


  - IllegalArgumentException 설명
> https://create-drop.tistory.com/entry/Java-javalangIllegalArgumentException-%ED%95%B4%EA%B2%B0%EB%B2%95