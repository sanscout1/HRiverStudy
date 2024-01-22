package JAVA.Java_Lecture.About_Stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx06 {
    // reduce() 최종연산 : 프로그래머가 직접 지정하는 연산을 적용
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김진성", "강호동", "유재석", "신동엽", "서장훈");
        String name1 = names.stream().reduce("이순신", (s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        System.out.println(name1);

        List<Integer> numbers = Arrays.asList(10, 5, 3, 5, 6, 7, 9);
        //reduce() 로 numbers의 누적합, 누적곱 출력하는 문장 구현
        int a = numbers.stream().reduce(0, (s1, s2) -> s1 + s2);
        int b = numbers.stream().reduce(1, (s1, s2) -> s1 * s2);
    }
}
