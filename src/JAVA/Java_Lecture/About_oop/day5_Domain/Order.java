package JAVA.Java_Lecture.About_oop.day5_Domain;

import java.util.List;

public class Order {

    private List<OrderLine> orderLines;

    private Money totalAmounts;

    private ShippingInfo shippingInfo;

    private OrderState state;

    public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo){
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }



    public void changeShipped(ShippingInfo shippingInfo){
        verifyNotYetShipped();
        setShippingInfo(shippingInfo);
    }

    private void verifyNotYetShipped() {
        if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING)
            throw new IllegalArgumentException("already shipped");
    }

    public void changeShippingInfo(ShippingInfo newShipping){}
    public void cancel(){
        verifyNotYetShipped();
        this.state =OrderState.CANCELED;
    }
    public void completePayment() {}

    //출고상태 변경하기, 배송지 정보 변경하기, 주문취소하기, 결제완료하기
    private void setOrderLines(List<OrderLine> orderLines){
        verifyAtLeastOneorMoreOrderLines(orderLines);
        this.orderLines=orderLines;
        calculateTotalAmounts();
    }

    private void setShippingInfo(ShippingInfo shippingInfo) {
        if(shippingInfo==null)
            throw new IllegalArgumentException("no ShippingINfo");
        this.shippingInfo=shippingInfo;
    }


    private void calculateTotalAmounts() {
        int sum = orderLines.stream().mapToInt(x ->x.getAmounts()).sum();
        this.totalAmounts=new Money(sum);
    }

    private void verifyAtLeastOneorMoreOrderLines(List<OrderLine> orderLines) {
        if (orderLines == null || orderLines.isEmpty()){
            throw new IllegalArgumentException("no OrderLine");
        }
    }


}
