package Java_Lecture.About_Stream.StreamPack03;

import Java_Lecture.About_Stream.StreamPack02.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentMappingEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1. Student 클래스 타입의 stulist 리스트 컬렉션을 생성하세요
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







        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        // 삐비빅 스트림 활용 고민 시작

        List<List<Integer>> totalExam =  new ArrayList<List<Integer>>();
        totalExam = Stream.of(totalScore,avgScore).collect(Collectors.toList());
//        totalExam.add(new ArrayList<>(totalScore));
//        totalExam.add(new ArrayList<>(avgScore));
        // 이중리스트에 들어갈 리스트 목록을 Stream.of를 이용하여 넣고, .collect 하기
        // 결과 출력
        System.out.println("Stream.of 로 그냥 두개 넣기");
        System.out.println(totalExam);
        System.out.println();

        //람다 표현식에서는 외부 변수를 사용할 때 해당 변수는 사실상 final 또는 유사 final이어야 합니다.
        // 이는 람다 표현식이 클로저로서 외부 범위의 변수를 캡처하기 때문입니다.
        List<Integer> finalTotalScore = totalScore;
        List<Integer> finalAvgScore = avgScore;
        List<List<Integer>> combinedList = IntStream.range(0, totalScore.size())
                .mapToObj(i -> Arrays.asList(finalTotalScore.get(i), finalAvgScore.get(i)))
                .collect(Collectors.toList());
        System.out.println("이중리스트에 다른 리스트 값을 교차로 리스트로 저장하기");
        System.out.println(combinedList);
        System.out.println();
        //총합 평균을 묶은 리스트로 만들기





        //해쉬 맵에 넣는 요상한 방법  boxed 함수는 intStream 같은 원시스트림을 Stream<Integer> 같이 바꿔주는 것
        List<Integer> finalKorScoreList = korScoreList;
        List<Integer> finalEngScoreList = engScoreList;
        List<Integer> finalMathScoreList = mathScoreList;
        Map<String, List<Integer>> resultMap = IntStream.range(0, namelist.size())
                .boxed()
                .collect(Collectors.toMap(   // Collectors.toMap() 으로 엔트리 만들어서 수집하기
                        namelist::get,
                        i -> Arrays.asList(finalKorScoreList.get(i), finalEngScoreList.get(i),
                                finalMathScoreList.get(i),finalTotalScore.get(i), finalAvgScore.get(i))
                ));  // Arrays.asList 로 리스트 생성 하는 방법도 익숙해지자


//        List<Integer> resultlist2 = IntStream.range(0, totalScore.size()).

        // 결과 출력
        System.out.println("키값에 Stringlist를, value에 다양한 integerlist를 넣는 방법");
        System.out.println(resultMap);
        System.out.println();
        System.out.println("맵에 이중 리스트 내용물을 [] 없애고 빼서 스트림으로 출력하기");
        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " +     // Collectors.joining(" ") : StringBuilder 생성하고 계속 추가해준후 반환
                        entry.getValue().stream().map(i -> i.toString()).collect(Collectors.joining(" ")))
                .forEach(System.out::println);                  // .peek(System.out::println) 중간에 넣어서 확인가능
        System.out.println();                               //toString() 은 기본적으로 문자열로 바꿔주는 함수,,,,

//        resultMap.values().stream().map(entry -> entry.stream().map(i -> i.toString()).collect(Collectors.joining(" ")))
//                        .forEach(System.out::println); //





        System.out.printf("%s%3s%3s%3s%3s%3s%3s\n","번호","이름","국어","영어","수학","총점","평균");
        for (int j = 0; j < stulist.size(); j++) {
            System.out.println(j +"   "+stulist.get(j).getName()+" "+stulist.get(j).getKorscore()+"  "+ stulist.get(j).getEngscore()+"  "+ stulist.get(j).getMathscore()+"  "
            +totalExam.get(0).get(j)+"  "+totalExam.get(1).get(j)+" ");
        }

    }
}
