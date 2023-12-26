package Java_Test.InterfaceQuiz1226;

public abstract class Animal {

     private int speed;
     private double distance;

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
