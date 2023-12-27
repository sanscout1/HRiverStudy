package Java_Lecture.About_oop.day_interface.interExample03;

public class Driver {
    void drive(Vehicle v){   // vehicle 로 받아서 promotion 을 하게 함
        // 구현 객체가 대입될 수 있도록 매개변수를 인터페이스 타입으로 선언
        v.run();
    }

}
