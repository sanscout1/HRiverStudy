package JAVA.Java_Lecture.About_Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaTest {
    public static void main(String[] args) {
        // 1. 제시되는 list를 오름차순으로 정렬하는 람다식을 작성하세요
        List<String> list = Arrays.asList("apple","banana","pear","orange");

        list.stream().sorted(String::compareTo)
                .forEach(System.out::println);

        list.sort(String::compareTo);;
        //foreach는 stream에서 사용가능
        System.out.println();

        //2. 문자열을 대문자로 변환하는 람다 표현식
        list= list.stream().map(String::toUpperCase).collect(Collectors.toList());

        Function<String,String> toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.apply("heelo"));

        // 3. 문자열이 비어 있는지 확인하는 람다 표현식

        System.out.println(list.stream().map(String::isEmpty).collect(Collectors.toList()));

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));


        // 4. 두 문자열을 연결하는 람다 표현식


        BiFunction<String, String, String> StringBiFunction = (String str1, String str2) -> str1 + str2;
        BiFunction<String, String, String> concatName = String::concat;
        System.out.println(StringBiFunction.apply("banana","apple"));

        // 5. 숫자의 제곱을 계산하는 람다식

        Function<Integer,Integer> square = (number) -> number*number;
        System.out.println(square.apply(5));

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers=integers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(integers);
    }
}
