package Java_Lecture.About_API;

import java.util.Scanner;

public class FinallyTest {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
        FinallyTest test = new FinallyTest();
        int checkn = FinallyTest.returnintFinally(in.nextInt(), in.nextInt());
            System.out.printf("return : ");
            System.out.println(checkn);
        } catch (Exception e){
            System.out.println("메인메소드 캐치");
        }
        finally {
            System.out.println("종료");
        }

    }
    // finally 구문은 return, break; 다 무시하고 실행한다 .... 그래서 여기서 무조건 return 값이 2이 나온다.
    static int returnintFinally(int number1, int number2) {

        double c = 0;
        try {
            c = number1 / number2;
            return 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 1;
        }
        finally {
            System.out.println(c);
            System.out.println("함수종료");
            return 2;
        }

     //   return 3;
    }
}
//static void returnintFinally(int number1,int number2) throws ArithmeticException{
//
//        double c =0;
//            c=  number1/number2;
//            System.out.println(c);
//    }
//}
