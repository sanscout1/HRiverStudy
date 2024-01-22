package JAVA.Java_Lecture.About_oop.day_interface.interExample03;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);  //자동타입변환 promotion --> 오버라이딩 메소드 호출 --> 다형성
        driver.drive(taxi);

    }
    //인터페이스 매개변수를 가지는 메소드
    public static void ride(Vehicle vehicle){
//        if(vehicle instanceof  Bus){
//            Bus bus = (Bus) vehicle;
//            bus.checkFare();
//        }
        //위 아래가 동일 식임 ,,,, 자바 12버전부터 지원
        if(vehicle instanceof Bus bus) bus.checkFare();
        vehicle.run();
    }
}
