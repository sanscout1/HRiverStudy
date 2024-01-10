package Java_Lecture.About_Lamda.LamdaQuiz;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LamdaQuiz02 {
    //1. 람다식에 대한 설명으로 틀린 것은 무엇입니까?
    // 4
    // 1) 9번 문제 보면 알 수 있음

    // 2. 메소드 참조와 생성자 참조에 대한 설명으로 틀린 것은 무엇입니까?
    // 4 --> 매개변수 받는애도 만들 수 있디 (constructor에 있음 예제)


    // 3. 다음 중 잘못 작성된 람다식은?
    // 2 번

    // 4.
//    interface Function {
//        double apply(double x, double y);
//    }
//    public static double calc(Function fun){
//        double x= 10;
//        double y= 4;
//        return  fun.apply(x,y);
//    }  //여기 매개변수 함수 이름과, 메서드 이름을 그대로 함수형 인터페이스로 만들어야 한다.


    public static double calc(BiFunction<Double,Double,Double> fun){
        double x= 10;
        double y= 4;
        return  fun.apply(x,y);
    }

    // BiFunction 으로 인수 받으면 함수형 인터페이스를 따로 정의 안해도 똑같이 이용이 가능하다.

    public static void main(String[] args) {

        double result = calc((x,y)->(x/y));
        // 이렇게 하면 람다식이 Function 인터페이스 메소드 정의를 바로 해버리는 것
        System.out.println("result : " + result);
    }


}
