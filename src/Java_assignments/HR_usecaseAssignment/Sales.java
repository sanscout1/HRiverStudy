package Java_assignments.HR_usecaseAssignment;

public class Sales {
    private Inventory inventory;
    private int totalSales;

    Sales(){}
    Sales(Inventory inventory){
        this.inventory=inventory;
    }
    // 매출 현황 출력, 시간순 출력, 결제방법 출력 세가지
    public void printSales(){}

    public void printSalesTimeline(){}
    public void printSalesPayment(){}
}
