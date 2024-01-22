package JAVA.Java_Lecture.About_Stream;

import java.util.Arrays;

public class StreamEx02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        // 파이프라인 구성
        int sum = Arrays.stream(array).filter(n -> n%2 ==1).sum();


    }
}
