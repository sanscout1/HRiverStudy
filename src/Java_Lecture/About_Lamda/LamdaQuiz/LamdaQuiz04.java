package Java_Lecture.About_Lamda.LamdaQuiz;

import java.util.Arrays;

public class LamdaQuiz04 {
    private static Student[] students = {
            new Student("홍길동",90,96),
            new Student("신세계",90,95)
    };

    public static double avg(Function<Student> func) {
        double average = Arrays.stream(students)
                //.mapToDouble(student -> func.apply(student))
                .mapToDouble(func::apply)
                .average()
                .orElse(0.0);
   //함수를 정의 해서 쓸곳만 인터페이스의 메서드 명시 해두고
        return average;
    }

    public static void main(String[] args) {
        //double englishAvg = avg( s-> s.getEnglishScore());
        double englishAvg = avg(Student::getEnglishScore);
        // 정의를 여기서 하도록 한다.
        System.out.println("영어 평균: " + englishAvg);

        //double mathAvg = avg( s-> s.getMathScore());
        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균: " + mathAvg);
    }
}
