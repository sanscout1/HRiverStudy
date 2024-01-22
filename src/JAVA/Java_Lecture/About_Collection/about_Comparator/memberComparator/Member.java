package JAVA.Java_Lecture.About_Collection.about_Comparator.memberComparator;

public class Member implements Comparable<Member>{
    public  String name;
    public  Integer age;
    public Member(String name, Integer age){
        this.name=name;
        this.age=age;
    }
    public int hashCode(){
        return name.hashCode() + age;
    }

    public  boolean equals(Object o){
        if ( o instanceof  Member m){
            return m.name.equals(name)&& (m.age==age);
        } else {
            return  false;
        }
    }


    //값을 넣을 때 마다 비교하며 정렬하는 것

    //return 0 은 비교할게 없다고 판단하여 넘어가는것, 저장을 안함
    @Override
    public int compareTo(Member o) {
        //여기서 this 는 비교할 모든 객체들

        if(age<o.age) return 1;
        else if (age== o.age) return 0;
        else return -1;
//       return o.age-age;
//    내림차순
        // 기준은 첫 add 한애
        // 들어온애랑 비교해서 리턴이 음수라면 기준이 더 작은거라고 판단하고 정렬! 기본인 오름차순이기에
        // 작다고 판단하니 더 앞에 출력 되도록 하는것





        // 둘이 같은거
//        if(age<o.age) return -1;
//        else if (age== o.age) return 0;
//        else return 1;
        // return age.compareTo(o.age); 오름차순 정렬 하는법 짧게
        //return age - o.age;
    }
}
