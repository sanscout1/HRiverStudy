package JAVA.Java_Lecture.About_oop.day5_Domain.PhonePerson_dependency_association;

public class Phone {
    public void sendMessage(String to, String message){
        System.out.println(to + "에게 보낸 메세지 " + message);
    }
}
