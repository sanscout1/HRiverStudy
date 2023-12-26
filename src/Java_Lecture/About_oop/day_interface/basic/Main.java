package Java_Lecture.About_oop.day_interface.basic;

public class Main {
    public static void main(String[] args) {
//        Television television = new Television();
//        television.turnOn();
//        television.turnOff();

        RemoteControl rc;
        RemoteControl rc1;

        rc = new Television();  //동일 인터페이스로 참조형을 결정하여 생성한 객체들은 생성한 클래스가 무엇이냐에 따라 함수 호출 가능
        rc1 = new Audio();

        rc.turnOn();
        rc1.turnOn();
    }
}
