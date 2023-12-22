package Java_Lecture.About_oop.day5_Domain.MyNoteBook_aggregation_composition;


public class MyNoteBook {
    private Wifi wifi;
    //집합 연관 --> aggregation 설명
//    public MyNoteBook(Wifi wifi){
// //       this.wifi=wifi; //집합연관
//    }
    public MyNoteBook(){
        //       this.wifi=wifi; //집합연관
        this.wifi = new Wifi();   //복합 연관 --> 클래스 내에서 객체 생성해버림 -- 메인에서 생성한것과 차이
    }

    void openBrowser(){
        this.wifi.connectionInternet();
    }

}
