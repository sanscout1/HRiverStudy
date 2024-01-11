package Java_Lecture.About_Stream.StreamPack03;

// 학생별 국어점수 학생별 영어점수 학생별 수학점수 학생이름 오름차순 정렬, 내림 차순 정렬
// 총점 평균 ...... 평균을 기준으로 오름차순 정렬

import Java_Lecture.About_Stream.StreamPack02.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingComparableEx {
    public static void main(String[] args) {
        List<Student> stulist = new ArrayList<Student>();

        // 2. Scanner 로 학생의 이름과 성적을 입력받아 5명의 학생 객체를 저장

        IntStream.rangeClosed(1,5).forEach(i -> stulist.add(new Student("학생"+i,80+i,70+i,60+i)));

        // 3. 학생별 이름만 저정한 namelist 출력
        List<String> namelist = new ArrayList<>();
        namelist= stulist.stream().map(Student::getName).toList();

        // 4, 국어점수 리스트
        List<Integer> korScoreList = new ArrayList<>();
        korScoreList = stulist.stream().map(Student::getKorscore).toList();
        // 5. 국어 점수 총합, 평균
        int kortotal = korScoreList.stream().mapToInt(Integer::intValue).sum();
        int koravg =(int) korScoreList.stream().mapToInt(Integer::intValue).average().getAsDouble();

        // 영어
        List<Integer> engScoreList = new ArrayList<>();
        engScoreList =stulist.stream().map(Student::getEngscore).toList();

        int engtotal = engScoreList.stream().mapToInt(Integer::intValue).sum();
        int engavg =(int) engScoreList.stream().mapToInt(Integer::intValue).average().getAsDouble();

        // 수학

        List<Integer> mathScoreList = new ArrayList<>();
        mathScoreList = stulist.stream().map(Student::getMathscore).toList();

        int mathtotal = mathScoreList.stream().mapToInt(Integer::intValue).sum();
        int mathavg = (int) mathScoreList.stream().mapToInt(Integer::intValue).average().getAsDouble();


        //학생 별 총합 점수와 평균을 구하여 totalExam에 저장하여 최종 성적표 출력
        List<Integer> totalScore = new ArrayList<Integer>();
        totalScore = stulist.stream().map(i ->i.getMathscore()+ i.getEngscore()+ i.getKorscore()).toList();

        List<Integer> avgScore = new ArrayList<Integer>();
        avgScore = totalScore.stream().map(i -> (int)i/3).toList();


        stulist.stream().sorted(Comparator.reverseOrder()).forEach(student -> System.out.println(student.getEngscore()) );



    }
}
