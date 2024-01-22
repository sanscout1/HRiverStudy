package JAVA.Java_Lecture.About_Stream.StreamPack03;


//루핑 : peek : 중간처리 메서드 , foreach() : 최종처리 메서드
// consumer 함수형 인터페이스를 매개타입 받음 , 매가값을 소비하는 메서드 accept() 사용

import java.util.Arrays;

public class PeekForEachEx {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8};
        Arrays.stream(intArray).filter(i -> i%2==0).peek(n-> System.out.println(n));
        Arrays.stream(intArray).filter(i -> i%2==0).peek(n-> System.out.println(n)).sum();
        //peek 함수는 중간에 이렇게 잘 되는지 확인 출력 가능해서 보통 디버깅용으로 사용한다.
    }
}
