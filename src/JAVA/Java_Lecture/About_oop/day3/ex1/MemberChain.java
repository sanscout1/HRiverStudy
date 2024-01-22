package JAVA.Java_Lecture.About_oop.day3.ex1;

public class MemberChain {

    private String firstName;
    private String country;

    private int age;


    public MemberChain(){
        this("홍길동");
    }
    public  MemberChain(String firstName){
        this(firstName,"대한민국");
    }

    public  MemberChain(String firstName,String country){
        this(firstName,country,20);
    }
    public MemberChain(String firstName,String country,int age){
        this.firstName=firstName;
        this.country=country;
        this.age=age;
    }

    public void printInfo(){
        System.out.println("이름 : "+firstName);
        System.out.println("국적 : "+country);
        System.out.println("나이 : "+age);
    }

}
