package Java_Test.InterfaceQuiz1226;

public class Dog extends Animal{

    Dog(int speed){
        super(speed);
    }


    @Override
    void run(int hours) {
        super.setDistance(super.getDistance()+super.getSpeed()*hours/2);
    }
}
