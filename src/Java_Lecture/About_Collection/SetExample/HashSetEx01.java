package Java_Lecture.About_Collection.SetExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean check = false;

       check= set.add("신세계 자바 과정1");
        System.out.println(check);   // 값 잘들어가서 true 나옴
        check=false;
        set.add("신세계 자바 과정2");
        set.add("신세계 자바 과정3");
        check=set.add("신세계 자바 과정3");  //Duplicate Set element
        System.out.println(check);      //같은값 넣어서  false 나옴
        int size = set.size();
        System.out.println(size);


        Set<Member> members = new HashSet<Member>();

        members.add(new Member("최문석",33));
        members.add(new Member("윤여빈",21));
        members.add(new Member("윤여빈",21));
        // 다른 객체라도 hashCode() 메소드의 리턴값이 같고, equals() 메소드가true를 리턴하면동일한 객체라고 판단하고 중복 저장하지 않음



        System.out.println(members.size());

        //객체를 하나씩 가져와서 처리
        Iterator<Member> iterator = members.iterator();
        while (iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member.age + " "+ member.name);
            if(member.name.equals("최문석")){
                iterator.remove();
            }
        }

        for (Member member : members) {
            System.out.println(member.age+ " "+ member.name);
        }
    }
}
