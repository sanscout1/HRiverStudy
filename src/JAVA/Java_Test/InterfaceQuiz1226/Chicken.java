package JAVA.Java_Test.InterfaceQuiz1226;

public class Chicken extends Animal implements Cheatable{

    Chicken(int speed){
        super(speed);
    }
    @Override
    void run(int hours) {
        super.setDistance(super.getDistance()+super.getSpeed()*hours);
    }

    @Override
    public void fly() {
        super.setSpeed(super.getSpeed()*2);
    }
}
