package Java_assignments.HR_usecaseAssignment;
//송장 출력
public class Invoice {
//    송장자동출력 설정 : 택배사 선택, 발송지정보(창고 정보 : 보내는 사람, 번호, 주소)
//    송장 출력(주문 확인 창) : 주문확정 된 곳에 송장 자동 생성 버튼이 있음

    private String shipping;
    private String senderName;
    private String senderAddress;
    private boolean isSetInvoice=false;
    private boolean isOrder = false;
    Invoice(){}
    Invoice(String shipping, String name,String address){
        this.shipping=shipping;
        this.senderName=name;
        this.senderAddress=address;
        this.isSetInvoice=true;
    }
    public void checkIsOrder(Order order){
        if(order.isOrderNow()) {
            this.isOrder = true;
        }
    }
    public void printInvoice(){
        if(isSetInvoice) {
            System.out.println("송장을 출력했습니다.");
        }
        else {
            System.out.println("송장자동출력설정을 해주세요.");
        }
    }
}
