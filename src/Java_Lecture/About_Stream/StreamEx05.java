package Java_Lecture.About_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// map() : 스트림을 구성하는 데이터를 조건에 따라 변환 중간연산

public class StreamEx05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","pear","orange","banana","tomato");
        // list의 문자열을 대문자로 변환하여 출력하세요

        list.stream().map(String::toUpperCase).forEach(i->System.out.print(i+" "));
        System.out.println();
        // 소문자로 변환하여 출력
        list.stream().map(String::toLowerCase).forEach(i->System.out.print(i+" "));


        // 1. of 메소드를 이용하여 직접 입력해 입력스트림을 만들 수 있습니다.
        // 2. 합계를 구하는 최종연산을 합니다.
        int total=IntStream.of(1,3,5,6,9).sum();

        // 3. 변수에 최종 연산의 결과를 반환 받은 후 변수를 이용하여 값을 출력합니다.
        System.out.println(total);


        // 4. 스트림 데이터 개수를 세는 최종연산을 합니다.
        long cnt =IntStream.of(1,3,5,6,9).count();
        System.out.println(cnt);

        // 5. 스트림 데이터 평균을 구하는 최종 연산을 합니다
        double avg=IntStream.of(1,3,5,6,9).average().orElseGet(()->0.0);


        // 6. 최종 연산 결과를 변수로 받지 않고 결과가 존재한다면 출력하는 처리를 합니다.
        IntStream.of(90,80,77,40,55).average().ifPresent(avg1-> System.out.println("avg: "+avg1));
        // ifPresent --> optional 객체 값이 있다면 실행하는 함수
        // ifPresent(a -> { throw new Exception});  이렇게 예외처리로도 가능
        // 7. 스트림 데이터의 최소값 구하기
        IntStream.of(1,3,5,6,9).min().ifPresent(min1-> System.out.println("min: "+min1));
        //8. 스트림 데이터 최댓값 구하기
        IntStream.of(1,3,5,6,9).max().ifPresent(max1-> System.out.println("max: "+max1));

        //
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,33,22,20,7,8);

        //int total2 = IntStream.of(numbers).sum();  이거 고치기
        // 1
        int total2 = numbers.stream().mapToInt(Integer::intValue).sum();
        // 2
        int total3 = IntStream.of(numbers.stream().mapToInt(Integer::intValue).toArray()).sum();
        // toArray() 는 stream 을 배열로 바꿔준다
    }

}
