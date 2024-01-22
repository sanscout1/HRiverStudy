package JAVA.Java_Lecture.About_Collection.about_Comparator.memberComparator;

import java.util.TreeSet;

public class ComparableMember {
    public static void main(String[] args) {
        TreeSet<Member> members = new TreeSet<>();

        members.add(new Member("김진영",22));
        members.add(new Member("김진아",21));
        members.add(new Member("김소영",21));
        members.add(new Member("박소영",25));
        //compareTo 함수는 return 0만 있으면 비교를 하지않고 저장을 끝내버림
        // 사용시 내가 정의한 기준으로 비교 정렬 하도록 해야함
        System.out.println(members.size());
        // 이것을 보니 넣을때 compareTo 가 실행되면서 넣을지 판단함.
        for(Member m : members){
            System.out.println(m.name + " "+ m.age);
        }

    }
}
