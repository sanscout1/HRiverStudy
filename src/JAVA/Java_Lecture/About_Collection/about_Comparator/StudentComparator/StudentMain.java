package JAVA.Java_Lecture.About_Collection.about_Comparator.StudentComparator;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        Student student[] = new Student[5];
        //순서대로 "이름", 학번, 학점
        student[0] = new Student("Dave", 20240001, 4.2);
        student[1] = new Student("Amie", 20160001, 4.5);
        student[2] = new Student("Emma", 20110001, 3.5);
        student[3] = new Student("Brad", 20130001, 2.8);
        student[4] = new Student("Cara", 20140001, 4.2);

        System.out.println("과제1==============================================");
        Arrays.sort(student);
        Arrays.stream(student).forEach(studentTmp -> System.out.println(studentTmp.toString()));

        //과제 2
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Comparator.comparingDouble((Student stuTmp) -> stuTmp.score)
                        .thenComparingInt(stuTmp -> - stuTmp.id).compare(o2,o1);
                // 성적은 내림차순, 학번은 오름차순이기 때문에 반대로 가져오기 위해서 하나를 - 붙여준다

                //return Comparator.comparingDouble((Student stuTmp) -> stuTmp.score).reversed()
                //        .thenComparingInt(stuTmp -> - stuTmp.id).compare(o2,o1);
                //reversed() 로 반대 방향 출력도 가능
        }});
        
        System.out.println("과제2============================================");
        Arrays.stream(student).forEach(studentTmp -> System.out.println(studentTmp.toString()));
        //stream 에서 limit을 사용하면 출력을 제한 할 수 있다.
        System.out.println("과제2 스트림 출력!!!!!!!!!!!");
        Arrays.stream(student).limit(2).forEach(studentTmp -> System.out.println(studentTmp.toString()));
        System.out.println("과제2 for문 출력");
        for (int i = 0; i < 2; i++) {
            System.out.println(student[i].toString());
        }


    }
}
