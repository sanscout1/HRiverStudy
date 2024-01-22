package JAVA.Java_Lecture.About_Stream.StreamPack02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamEx01 {

    // list 컬렉션의 내부 반복자를 이용해서 병렬처리를 하는 방법
    // parallelStream() : 병렬 처리 스트림

    public static void main(String[] args) {

        List<String> names = Arrays.asList("김진성", "강호동", "유재석", "신동엽", "서장훈");

        Stream<String> parallelStream = names.parallelStream();  // 병렬 스트림 얻기
        parallelStream.forEach(
                name-> {
                    System.out.println(name + " : "+ Thread.currentThread().getName());
                }
        );
    }
}
