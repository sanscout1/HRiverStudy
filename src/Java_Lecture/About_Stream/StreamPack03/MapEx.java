package Java_Lecture.About_Stream.StreamPack03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        //1 정수형 배열 1,2,3,4,5 초기화 생성
        int[] intArray = {1,2,3,4,5};

        // intstream 으로
        IntStream intStream = Arrays.stream(intArray);

        // double stream 으로
        intStream.asDoubleStream().forEach(System.out::println);

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
    }
}
