package Java_Lecture.About_Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LamdaEx05 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dog", "cat", "elephant", "rabbit");
        // 문자열 리스트 오름차순

        Collections.sort(strings,(s1,s2)->s1.compareTo(s2));

        Collections.sort(strings,String::compareTo);


        // 정수 리스트 스트리밍하기, integers 대상으로 모든 짝수의 합을 구하는 식
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int total = integers.stream().filter(n -> n%2 == 0).mapToInt(i -> i.intValue()).sum();
        int total2 = integers.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).sum();



        String[] str1 = {"aaa", "bbb", "ccc"};
        // Collection List 컬렉션으로 변경
        List<String> stringList = Arrays.asList(str1);
        //StringList를 스트림 객체 생성
        Stream<String> stringStream = stringList.stream();
        Stream<String> str1Stream = Arrays.stream(str1);
        // 스트링 출력
        stringStream.sorted().forEach(System.out::println);

        // 스트림은 데이터 소스로부터 데이터를 읽기만 할뿐 , 변경하지 않는다.
        // 한번 사용하면 닫혀서 다시 사용할 수 없다.
        // 스트림 작업은 내부 반복으로 처리한다.


    }
}
