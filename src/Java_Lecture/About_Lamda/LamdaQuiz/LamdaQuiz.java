package Java_Lecture.About_Lamda.LamdaQuiz;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

interface MathOperation1 {
    int addTwoNum(int a,int b);
}

interface Calculator {
    int calculate(int a,int b);
}



public class LamdaQuiz {
    public static void main(String[] args) {
        // 1.정수 리스트가 주어졌을 때 람다를 사용하여 리스트에 있는 모든 짝수의 합을 계산하세요.
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int evenTotal = integerList.stream()
                .filter(i -> i%2==0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("문제 1번");
        System.out.println(evenTotal);

        // 2. 두 정수를 받아 그 합을 반환하는 람다 식을 작성하세요
        BiFunction<Integer,Integer,Integer> integerBiFunction = Integer::sum;

        int a = integerBiFunction.apply(5,6 );
        System.out.println("문제 2번");

        System.out.println(a);

        // 3. 문자열을 받아 그 길이를 반환하는 람다 표현식을 작성하세요

        List<String> stringArray  = Arrays.asList("가나다","마바사","아자차카타차파");
        System.out.println("문제 3번");
        stringArray.stream().map(String::length).forEach(System.out::println);
        System.out.println("=======");

        // 4.5. 정수 배열을 받아 모든 짝수의 합을 반환하는 람다 표현식을 작성하세요.

        Function<List<Integer>,Integer> evenIntegerTotal = tmpArray ->
                tmpArray.stream().mapToInt(Integer::intValue)
                .filter(num -> num%2==0).sum();

        int evenTotal2 = evenIntegerTotal.apply(integerList);
        System.out.println("문제 4번");
        System.out.println(evenTotal2);


        // 6. 정수 리스트를 받아 리스트에 있는 모든 숫자의 곱을 반환하는 람다 표현식을 작성하세요.
        Function<List<Integer>,Integer> mulIntegerTotal = tmpArray ->
                tmpArray.stream().reduce(1,(tmp1,tmp2) -> tmp1*tmp2);
        System.out.println("문제 6번");

        int multotal = mulIntegerTotal.apply(integerList);
        System.out.println(multotal);  // 1~ 10 곱

        // 7. 람다 식과 스트림을 사용하여 정수 리스트의 평균을 구하는 프로그램 작성
        double avg=integerList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("문제 7번");
        System.out.println(avg);

        //8. 두 개의 정수를 매개 변수로 받아 그 합계를 반환하는 계산이라는 메서드가 있는
        // MathOperation 이라는 함수형 인터페이스를 만듭니다.
        MathOperation1 mathOperation1 = (tmp1,tmp2) -> tmp1+tmp2;
        System.out.println("문제 8번");
        System.out.println(mathOperation1.addTwoNum(4,8));;

        // 9. 정수를 반환하는 calculate(int a , int b ) 이라는 메서드가 있는 Caluculator라는
        // 함수형 인터페이스를 만듭니다. 두 숫자를 더하고 그 합을 반환하는 함수형 인터페이스를
        // 구현하는 람다 표현식 만들기
        Calculator tmpCal = Integer::sum;
        System.out.println("문제 9번");
        System.out.println(tmpCal.calculate(1,4));


        //10. 필터,매핑 , 축소 연산을 사용하여 정수 리스트에서 모든 짝수의 총합을 구하세요
        int total2=integerList.stream().mapToInt(Integer::intValue).filter(i -> i%2==0).sum();

        System.out.println("문제 10번");
        System.out.println(total2);




    }
}
