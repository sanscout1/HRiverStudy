package JAVA.Java_Lecture.About_Stream.StreamPack03;
//카운팅, 총합, 평균 , 최댓값, 최솟값, 첫번째 요소

import java.util.Arrays;

public class AggregateEx {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.stream(array).count());
        System.out.println(Arrays.stream(array).sum());
        System.out.println(Arrays.stream(array).average().getAsDouble());
        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.stream(array).min().getAsInt());
        System.out.println(Arrays.stream(array).findFirst().getAsInt());

    }
}
