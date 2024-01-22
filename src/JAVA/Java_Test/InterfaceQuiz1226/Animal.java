package JAVA.Java_Test.InterfaceQuiz1226;

public abstract class Animal {

     protected int speed;
     protected double distance;

    Animal(int speed){
        this.speed=speed;
    }
    abstract void run(int hours);
    void setDistance(double distance) {
        this.distance=distance;
    }
    void setSpeed(int speed){
        this.speed=speed;
    }
    int getSpeed(){
        return this.speed;
    }
    double getDistance() {
        return distance;
    }

}
