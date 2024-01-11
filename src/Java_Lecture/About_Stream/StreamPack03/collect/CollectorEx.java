package Java_Lecture.About_Stream.StreamPack03.collect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
요소 수집
스트림은 요소들을 필터링 매핑한 후 요소들을 수집하는 최종처리 메소드 collect()을 제공한다.
collect()메소드를 사용하면 필요한 요소만 컬렉션에 담을 수 있고, 요소들을 그룹핑한 후 집계도 할 수 있다.

collect(Collector<T,A,R> collector)
            T: 요소
            A: accumulator 누적
            R: 저장
collector은 어떤 요소를 어떤 컬렉션에 수집할 것인지 결정


 */
public class CollectorEx {
    public static void main(String[] args) {
        List<Member> memberList = Arrays.asList(new Member(1,"홍길동","M"),new Member(3,"김길동","M"),
                new Member(2,"홍삼동","F"));

        //남자인 M 들만 따로 menlist에 저장하고 출력
        List<Member> menList = memberList.stream().filter(member -> member.getGender().equals("M")).toList();

        // 회원의 회원번호를 키로 회원이름을 값으로 하여 map으로 생성

        Map<Integer,String> map = new HashMap<Integer,String>();
//        memberList.forEach(i -> map.put(i.getNo(),i.getName()));
        map = memberList.stream().collect(Collectors.toMap(Member::getNo,Member::getName));


        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1 = IntStream.range(0,memberList.size()).boxed().collect(Collectors.toMap(
                i -> memberList.get(i).getNo(), i -> memberList.get(i).getGender()));

        // Collectors.groupingBy 를 사용하면 그거 기준으로 묶어서 맵 만듬
        Map<String,List<Member>> genderGroupmap = memberList.stream().collect(Collectors.groupingBy(member -> member.getGender()));
        System.out.println("성별기준으로 해쉬 모음");
        System.out.println(genderGroupmap);

        List<Member> maleMemberList = genderGroupmap.get("M");
        System.out.println("남자");
        maleMemberList.stream().forEach(member -> System.out.println(member.getName()));

        List<Member> femaleMemberList = genderGroupmap.get("F");
        System.out.println("여자");
        femaleMemberList.stream().forEach(member -> System.out.println(member.getName()));
    }
}
