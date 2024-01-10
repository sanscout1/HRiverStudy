package Java_Lecture.About_Stream.StreamPack02.product;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamEx {
    public static int total1;
    public static void main(String[] args) {
        String[] strings ={"초코파이","몽쉘통통","홈런볼"};
        //strings 스트림객체를 얻어 요소값 출력

        Arrays.stream(strings).forEach(System.out::println);

        //2. Integer 스트림 객체 얻기
        int[] scores = {90,80,77,80,65,98};
        IntStream integerStream = Arrays.stream(scores);

        // stream 은 한번 사용하면 사라진다
        int total = integerStream.sum();
        double avg =Arrays.stream(scores).average().orElse(0.0);
        long count = Arrays.stream(scores).count();

        System.out.println(total);
        System.out.println(avg);
        System.out.println(count);
        System.out.println();

        // 3. 숫자 범위로부터 스트림 얻기  (IntStream, LongStream) range() 메서드 존재
        IntStream stream = IntStream.range(1,100);
        stream.forEach(i -> total1+= i);
        System.out.println(total1);
        IntStream.rangeClosed(0,10).forEach(System.out::println);


        StringBuilder sb = new StringBuilder();
        IntStream.range(0,5).forEach(i -> sb.append("*"));
        IntStream.range(0,3).forEach(i-> System.out.println(sb));

    }
}
