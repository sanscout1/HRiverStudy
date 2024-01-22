package JAVA.Java_Lecture.About_oop.day5_Domain.MyNoteBook_aggregation_composition;

public class YourNoteBook {

    private Wifi wifi;

    public YourNoteBook(Wifi wifi){
        this.wifi=wifi;
    }

    void openKakaoTalk(){
        this.wifi.connectionInternet();
    }
}
