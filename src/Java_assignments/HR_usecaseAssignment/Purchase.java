package Java_assignments.HR_usecaseAssignment;

//발주 확정
public class Purchase {
    private boolean isOrder = false;
    private boolean isPurchase = false;
    private String datePurchase;
    private String storage;
    private String pointOfPurchase;   // 거래처

    Purchase() {
    }

    Purchase(String datePurchase, String storage, String pointOfPurchase) {
        this.datePurchase = datePurchase;
        this.storage = storage;
        this.pointOfPurchase = pointOfPurchase;
    }
    public void checkIsOrder(Order order){
        if(order.isOrderNow()) {
            this.isOrder = true;
        }
    }

    public void makePurchase() {
        if (this.isOrder) {
            this.isPurchase = true;
        } else {
            System.out.println("주문확정이 되어 있지 않습니다.");
        }
    }

    public void printPurchse() {
        System.out.printf("발주일자 : %s , 매입처 : %s , 재고창고 : %s\n", datePurchase, pointOfPurchase, storage);
    }

    public void cancelPurchase() {
        this.isPurchase = false;
    }


}
