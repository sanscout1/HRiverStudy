package Java_Lecture.About_oop;

public class mainStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student("후후", "정치외교");

        s1.name="하하";
        s1.major="컴퓨터";
        s1.study();
        String eat =s1.eat("짜장면");
        System.out.println(s1.name + "학생이" + eat + "먹었다.");

        s2.name="호호";
        s2.major="미술";

        System.out.println(s1.toString()); //객체 주소 출력
        System.out.println(s2.toString());

        System.out.println(s1.name+s1.major);
        System.out.println(s2.name+s2.major);
        System.out.println(s3.name+s3.major + s3.eat("떡볶이"));

    }
}
