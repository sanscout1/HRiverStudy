package Java_Lecture.About_class_basic;

public class Main {
    public static void main(String[] args) {
        Calculator.result();
        FourArithmetic.result();
        Operator.result();
    }
}

class Operator {


    public static void result() {
         int kor = 77;
         int eng = 87;
        System.out.println("총점:" + (kor + eng));
        System.out.println("평균:" + (kor + eng) / 2);
    }
}
     class FourArithmetic {


            public static void result() {
                int a= 12;
                int b = 2;
                System.out.println("a+b="+(a+b));
                System.out.println("a-b="+(a-b));
                System.out.println("a*b="+(a*b));
                System.out.println("a/b="+(a/b));}


    }

    class Calculator {


            public static void result()
            {
                int a=1;
                int b=1;
                int sum=a+b;
                System.out.println(sum);
            }


    }
