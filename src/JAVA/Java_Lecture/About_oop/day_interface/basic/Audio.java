package JAVA.Java_Lecture.About_oop.day_interface.basic;

public class Audio implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Audio On");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio Off");
    }
}
