package studyClass;

public class Test1 {

    public static void main(String[] args) {
        int value =5;
        System.out.println(value);
        String name="Java";
        String name1 = "Java";
        String name2 = "Java1";
        String name3 = new String("Java");  //인스턴스
        System.out.println(name.hashCode() == name1.hashCode());  //hashcode() --> 저장 주소값
        System.out.println(name1.equals(name));  //값비교 -> 주소내부의 값들을 비교함

        System.out.println(name2.hashCode());
        System.out.println(name.hashCode());

        System.out.println(name.hashCode()==name3.hashCode());


    }
}
