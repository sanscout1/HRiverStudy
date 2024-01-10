package Java_Lecture.About_Lamda;

import java.util.Arrays;
import java.util.List;

public class LamdaEx01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sumOfEvenNumbers = numbers.stream().filter(i -> i%2 ==0)
                .mapToInt(Integer::intValue)  //stream 내용물을 int 로 으로 바꿔주는 메서드 (sum메서드 쓸려고) // https://dev-kani.tistory.com/32
                .sum();                 // n -> n.intValue()

//        Stream 에서 sum() 을 사용하려면 IntStream, LongStream, DoubleStream 와 같은 기본형 (Primitive Type)
//        특화 스트림을 사용해야 합니다.
//        그래서 보통 mapToInt, mapToLong, mapToDouble 같은 메소드로 스트림을 변환시키고 사용
        System.out.println(sumOfEvenNumbers);


        // 이중 포문과 같은 이중 map

////         for loop
//        List<Card> cards = new ArrayList<>();
//        for (Denomination denomination : Denomination.values()) {
//            for (Suit suit : Suit.values()) {
//                cards.add(new Card(denomination, suit));
//            }
//        }
//
//
//// stream
//        final List<Cards> = Arrays.stream(Denomination.values())
//                .flatMap(denomination -> Arrays.stream(Suit.values())
//                        .map(suit -> new Card(denomination, suit)))
//                .collect(Collectors.toUnmodifiableList());

    }
}
