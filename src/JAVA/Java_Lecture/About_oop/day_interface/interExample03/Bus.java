package JAVA.Java_Lecture.About_oop.day_interface.interExample03;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus Drive");
    }

    public void checkFare(){
        System.out.println("버스승차요금을 확인해 주세요!");
    }
}
