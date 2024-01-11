package Java_Lecture.About_Stream.StreamPack03;

import java.util.Arrays;

public class MatchingEx {
    public static void main(String[] args) {
        int[] intArray = {2,4,6};

        //특정  조건에 만족하는지 여부 조사 최종처리 기능

        boolean result = Arrays.stream(intArray).allMatch(number -> number%2==0);
        boolean result1 = Arrays.stream(intArray).anyMatch(number -> number%3==0);
        boolean result2 = Arrays.stream(intArray).noneMatch(number -> number%2==0);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
