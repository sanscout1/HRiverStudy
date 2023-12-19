package Java_Lecture.About_oop.day4.inher.calcu;

public class Inheritance01 extends Calculation{
    private int a;
    private int b;
    Inheritance01(){}

    Inheritance01(int a , int b){
        super(a,b);
        this.a=a;
        this.b=b;
    }
    public int multiplication(){
        return a*b;
    }
}
