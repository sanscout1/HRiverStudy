package Java_Lecture.About_Stream.StreamPack03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//문장 스트림을 단어 스트림으로 변환, 문자열 숫자 목록 스트림을 숫자 스트림으로 변환하는 코드 작성
public class FlatMappingEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("this is java backend course");
        list1.add("i am a best developer");

        list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
                .forEach(word -> System.out.println(word));
    }
}
