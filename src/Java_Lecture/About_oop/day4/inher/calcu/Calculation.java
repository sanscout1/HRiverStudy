package Java_Lecture.About_oop.day4.inher.calcu;

public class Calculation {

    private int a;
    private int b;
    Calculation(){}

    Calculation(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int addition(){
        return a+b;
    }

    public int subtraction(){
        return a-b;
    }

}
