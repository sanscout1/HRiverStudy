package Java_assignments.HR_usecaseAssignment;

public class Order {
    private boolean isOrder = false;
    private Shoppingmall mallData;

    Order(){}
    Order(Shoppingmall mallData){    //쇼핑몰주문 수집
        this.mallData=mallData;
    }

    public void confirmOrder(){  //주문 확정
        this.isOrder=true;
    }
    public boolean isOrderNow(){
        return this.isOrder;
    }

}
