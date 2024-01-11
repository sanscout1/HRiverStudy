package Java_Lecture.About_Stream.StreamPack03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEx01 {
    public static void main(String[] args) {
        //1. List<String> ArrayList  컬렉션 생성
        List<String> nameList = new ArrayList<String>();

        // 2. 이름을 추가해주기, 같은이름도 넣어주기

        nameList.add("가가");
        nameList.add("가가");
        nameList.add("나나");
        nameList.add("다다");
        nameList.add("라라");
        nameList.add("마마");
        nameList.add("정정");
        nameList.add("정마");
        nameList.add("정나");
        nameList.forEach(i -> System.out.print(i+" "));;
        System.out.println();
        // 3. 중복요소 제거
        nameList.stream().distinct().forEach(i -> System.out.print(i+" "));
        System.out.println();

        // 4. 정으로 시작하는 요소만 필터링
        nameList.stream().filter(i -> i.startsWith("정")).forEach(i -> System.out.print(i+" ") );
        System.out.println();
        nameList.stream().filter(i -> i.matches("^정[가-힣]+")).forEach(i -> System.out.print(i+" ") );
        //regex는 ^정 만 하니까 정인 단어 하나만 찾아버린다,,, 뒤에 들어가는것도 생각해서 regex에 추가해줘야한다

        // 5. 중복요소 제거 하고 정으로 시작하는 요소만 필터링하여 lastnamelist로 저장
        System.out.println();
        List<String> lastnamelist = nameList.stream().filter(i -> i.startsWith("정")).distinct().toList();
        lastnamelist.forEach(i -> System.out.print(i+" "));




    }

}
