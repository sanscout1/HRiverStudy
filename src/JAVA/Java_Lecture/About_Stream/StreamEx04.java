package JAVA.Java_Lecture.About_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx04 {
    public static void main(String[] args) {
        // 1. sorted() : 스트림을 구성하는 데이터를 조건에 따라 정렬하는 연산

        List<String> stringList = Arrays.asList("홍길동 제주도 도망","풍자 먹찌빠","강호동 아는형님",
                "유재석 유퀴즈 온더 블록","서장훈 미운오리새끼","신동엽 토요일은 즐겁다");

        // 2. stream객체로 변환하여 오름차순(사전순)으로 정렬

        Stream<String> stm1=stringList.stream().sorted();
        stm1.forEach(System.out::println);

        //stringList.stream().sorted().forEach(System.out::println);

//        stringList.stream().sorted(Comparator.comparing(i -> i)).collect(Collectors.toList());

        //List<String> collect=stringList.stream().sorted().collect(Collectors.toList());
//        List<String> collect=stringList.stream().sorted().toList();


        // 3.  stream 객체로 반환하여 글자 길이순으로 정렬해주세요
        stringList =stringList.stream().sorted(Comparator.comparingInt(String::length))
                //sorted는 comparator 인수 하나만 받는다
                //그냥 Stream 의 sorted는 규칙을 comparator를 불러서 재정의 가능
                .collect(Collectors.toList());

        System.out.println();
        stringList.forEach(System.out::println);

        stringList.stream().sorted((tmp1, tmp2) -> tmp2.length()-tmp1.length()).forEach(System.out::println);
        //내림차순으로 바꾸는 건데 이렇게도 가능

//        stringList.stream().sorted(new Comparator<String>() {  // 이렇게 했었던거 리마인드
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        })
    }
}
