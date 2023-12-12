package studyClass;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //2반 한반당 학생수 5명인 scores를 생성 하세요. 1반 {90.80.70.60.50}  반{90.100.80,70,88}

        int[][] scores = {{90,80,70,60,50},{90,100,80}};  //2행 5열

        // 배열 scores 길이 [반]

        System.out.println(scores.length);  //행 갯수

        System.out.println(scores[0].length);  //첫 번째 반의 학생 수

        System.out.println(scores[1].length); // 두 번째 반의 학생 수

        System.out.println(scores[0][0]);  //1반의 1번 학생의 점수

        System.out.println(scores[1][0]);  //2반의 1번 학생의 점수 출력


        System.out.println(Arrays.stream(scores[0]).sum());
        System.out.println(Arrays.stream(scores[0]).average());
        System.out.println(Arrays.stream(scores[1]).sum());
        System.out.println(Arrays.stream(scores[1]).average());


       // https://hianna.tistory.com/553
    }
}
