package JAVA.Java_Test.InterfaceQuiz1226;

public class Dog extends Animal{

    Dog(int speed){
        super(speed);
    }


    @Override
    void run(int hours) {
        this.distance+=(speed*hours)/2;
    }
}
