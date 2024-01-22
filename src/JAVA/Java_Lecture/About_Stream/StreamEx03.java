package JAVA.Java_Lecture.About_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamEx03 {
    public static void main(String[] args) {
        int[] array = {1,5,3,2,4};
        List<Integer> integerList = new ArrayList<>();
        // foreach를 이용해서 array의 숫자를 list 에 추가하는데 홀수만 추가하기
        for (int i : array) {
            if(i%2==1) {
                integerList.add(i);
            }
        }

        //  이렇게도  추가 가능함
//        Arrays.stream(array).filter(i -> i%2==1).forEach(i -> integerList.add(i));
//        Arrays.stream(array).filter(i -> i%2==1).forEach(integerList::add);



        // list를 오름차순 정렬

        Collections.sort(integerList);

        //foreach list 출력
        for (Integer i : integerList) {
            System.out.println(i);
        }

        // stream 출력
        Arrays.stream(array).filter(i->i%2==1).sorted().forEach(System.out::println);
    }
}
