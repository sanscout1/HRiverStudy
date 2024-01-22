package JAVA.Java_Lecture.About_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx01 {
    public static void main(String[] args) {
        //1. 정수형 배열 array 생성하고 1,2,3,4,5 로 초기화하세요
        int[] intArray = {1,2,3,4,5};


//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);  //collection 에 배열넣듯이 원소 넣고싶으면 Arrays.aslist
//        Stream<Integer> l1 = list1.stream();   // collection 으로 만든애는 Stream<> 으로 생성

        //2. array배열에 스트림 객체 stm1을 생성
        IntStream stm1=Arrays.stream(intArray);   //기본형은 기본형에 맞게 스트림 사용
        Stream<Integer> stm11 =Arrays.stream(intArray).boxed();  //IntStream 을 boxed 함수를 통해 Stream<> 에 저장 가능
        //3. 중간연산 스트림객체 stm1 에 대해 홀수만 추출하여 스트림 객체 stm2에 저장
        IntStream stm2 = stm1.filter(i -> i%2==1);
        Stream<Integer> stm22 =stm11.filter(i -> i%2==1);

        //4. stm2 스트림객체 총합 구하기
        int total = stm2.sum();
//        int total22 =stm22.collect(Collectors.summingInt(Integer::intValue));
        int total22 = stm22.mapToInt(Integer::intValue).sum();  // 그냥 intstream으로 map 하고 합계 하랜다

        //5. 최종 결과 출력
        System.out.println(total);
    }
}
