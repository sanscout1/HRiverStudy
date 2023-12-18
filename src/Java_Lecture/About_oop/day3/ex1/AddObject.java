package Java_Lecture.About_oop.day3.ex1;

public class AddObject {
    private  Object a;
    private  Object b;
    private  int IntergerResult;

    private double DoubleResult;

    AddObject(int a , int b){
        this.a = a;
        this.b = b;
        adder(a,b);
    }
    AddObject(double a , double b){
        this.a = a;
        this.b = b;
        adder(a,b);
    }


    public void adder(Integer num1, Integer num2){
        int result = num1.intValue()+num2.intValue();
    }
    public void adder(Double num1, Integer num2){
        double result = num1.doubleValue()+num2.intValue();
    }
    public void adder(Integer num1, Double num2){
        double result = num1.intValue()+num2.doubleValue();
    }
    public void adder(Double num1, Double num2){
        double result = num1.doubleValue()+num2.doubleValue();
    }


//    void adder(int a, int b){
//        this.IntergerResult = a+b;
//        System.out.println(this.IntergerResult);
//    }
//    void adder(double a, double b){
//        this.DoubleResult = a+b;
//        System.out.println(this.DoubleResult);
//    }


}
