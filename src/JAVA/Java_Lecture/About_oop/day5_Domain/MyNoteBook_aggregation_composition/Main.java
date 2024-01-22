package JAVA.Java_Lecture.About_oop.day5_Domain.MyNoteBook_aggregation_composition;

public class Main  {
    public static void main(String[] args) {
        // Wifi internet = new Wifi();  //집합연관 생성

        MyNoteBook myNoteBook = new MyNoteBook();
//        YourNoteBook yourNoteBook = new YourNoteBook(internet);
        myNoteBook.openBrowser();
//        yourNoteBook.openKakaoTalk();
    }
}
