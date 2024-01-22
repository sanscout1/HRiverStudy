package JAVA.Java_Lecture.About_Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaEx04 {

    public static void main(String[] args) {

        // 스트림 api는 컬렉션에서 다양한 연산을 수행하기 위해 람다 표현식을 허용하는 메서드를 제공한다.
        // 1. map()
        // 스트림의 요소를 다른 유형으로 변환하는데 사용

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumber = numbers.stream().map(n -> n*n).toList(); // collect(Collectors.toList()
        System.out.println(squaredNumber);

        //2.filter()
        // 조건에 따라 (if 문) 스트림에서 요소를 선택하는데 사용 (조건을 정의하는 람다 표현식을 인수로 받는다)
        //2-1 numbers 대상으로 홀수리스트 oddNumber 구성하여 출력
        List<Integer> oddnumbers = numbers.stream().filter(i -> i%2==1).collect(Collectors.toList());
        numbers.stream().filter(i -> i%2==1).forEach(i -> System.out.print(i+" "));
        System.out.println();
        //2-2 numbers 대상으로 짝수리스트 evenNumber 구성하여 출력
        List<Integer> evenNumbers = numbers.stream().filter(i -> i%2==0).collect(Collectors.toList());
        numbers.stream().filter(i -> i%2==0).forEach(i -> System.out.print(i+" "));


        // 3. 집계함수 : reduce()   스트림의 요소를 단일 값으로 집계하는 것 (축소 연산을 정의하는 람다 표현식을 인수로)
        int total = numbers.stream().reduce(0,(x,y) ->x+y);
        System.out.println(total);


        // 4. forEach() : 스트림의 요소를 반복하고, 각요소에 대해 작업을 수행하는데 사용 ( 수행 작업을 정의하는 람다 표현식을 인수로)
        numbers.stream().forEach(number -> System.out.println(number));
        numbers.forEach(number -> System.out.println(number));


        // 응용 문제 스트림을 사용하여 리스트 numbers의 평균을 구하는 람다식을 작성하세요
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                //optional double 이기 때문에 보통 getAsDouble() 를 사용하여 double 바꿔줘야한다.
                .orElse(0.0);
                // orElse를 사용하면 getAsDouble() 처럼 double로 바꿔준다.  optional double 에서만 사용 가능한 메서드
        // optional 값이 null 일때 지정한 초기값이 나오도록 해주는 것
        // orElse는 메서드를 초기값으로 해두면 null 이 아니여도 실행해버리는 오류가 있다. 따라서 아래 방법을 사용하는게 좋다


        double average1 = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                //optional double 이기 때문에 보통 getAsDouble() 를 사용하여 double 바꿔줘야한다.
                .orElseGet(() -> 0.0);
        // orElseGet() 은 동일한 역할을 하지만 람다식 혹은, 메서드를 넣어야한다.
        //orElseGet(() -> getName()); 이런느낌쓰

        //orElseThrow() 애는   .orElseThrow(() -> new IllegalArgumentException("user doesn't exist"); 이렇게 예외를 던지는거
        System.out.println(average);
    }
}
