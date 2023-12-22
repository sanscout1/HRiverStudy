package Java_Lecture.About_oop.day5_Domain.PhonePerson_dependency_association;

public class Person {


    public void sendMessage(Phone phone){
        String to = "나의 벗";
        String message = "???!";
        phone.sendMessage(to,message);  //더욱 완전한 의존관계 ... 메서드내에서만 객체 생성해서 메서드 쓰는 것
    }



//    private Phone phone;   // 소유 개념
//
//    Person (){}
//
//    Person (Phone phone){
//        this.phone =phone;
//    }
//
//    public void createMessage (){
//        String message = "안녕 반가워. 오늘 몇시에 만날까?";
//        String to = "내 친구";
//        this.phone.sendMessage(to,message);  //연관관계  ... 생성자를 통해 생성한 타 클래스 객체를 맴버에서 보관을 하는 것
//
//    }
}
