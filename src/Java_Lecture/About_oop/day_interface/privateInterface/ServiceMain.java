package Java_Lecture.About_oop.day_interface.privateInterface;

public class ServiceMain {


    public static void main(String[] args) {
        Service service = new ServiceImpl();  // 인터페이스 변수 선언하고 구현 객체 대입 (injection)
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();
        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();



    }
}
