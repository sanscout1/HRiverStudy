package Java_Lecture.About_Stream.StreamPack02;



import java.util.Arrays;
import java.util.List;

public class StudentMain {
    private static Student[] students = {
            new Student("홍길동",90),
            new Student("이수연",99),
            new Student("이한강",76),
            new Student("정휘제",88),
            new Student("윤호상",92),
            new Student("졸려요",65),
            new Student("신세계",90)
    };
    public static void main(String[] args) {
        //배열
        double a= Arrays.stream(students).mapToDouble(Student::getScore).average().orElse(0.0);

        //list
        List<Student> students = Arrays.asList(new Student("홍길동",90),
                new Student("이수연",99),
                new Student("이한강",76),
                new Student("정휘제",88),
                new Student("윤호상",92),
                new Student("졸려요",65),
                new Student("신세계",90));

        double b =students.stream().mapToDouble(Student::getScore).average().orElse(0.0);

    }




}
