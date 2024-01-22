package JAVA.Java_Lecture.About_oop.day1;

public class Student {

    public String name;
    public String major;

    public  Student(){}  //기본 생성자  오버로딩 시에는 디폴트 생성자 작성해야할 것!
////
    public Student(String name, String major){
        this.name=name;
        this.major=major;
    }  //constructor overloading    --> 메소드 매개변수 타입변경, 개수 변경

//    public Student(String name){
//        this.name=name;
//    }
//
//    public Student(String major){
//        this.major=major;
//    }
    public void study(){
        int stydyE = 0;
        stydyE++;
        System.out.println("학습 능력이 상승했습니다.");
    }

    public String eat(String food) {
        return  food + "를 맛있게 냠냠!";
    }

}
