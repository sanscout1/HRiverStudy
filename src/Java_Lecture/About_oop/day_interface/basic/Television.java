package Java_Lecture.About_oop.day_interface.basic;

public class Television implements  RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("Tv전원 On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV전원 off");
    }
}
