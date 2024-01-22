package JAVA.Java_Lecture.About_Reference_address;

public class test4 {


        public static void PrintItem(int[] scores){
            System.out.printf("점수 : ");
            int total=0;

            for(int i : scores){
                System.out.printf("%d,= ",i);
                total+=i;
            }
            System.out.println();
            System.out.printf("총합 : %d  ",total );
            System.out.printf("평균 : %.1f ",(float)total/scores.length);
        }



    public static void main(String[] args) {
        //성적을 저장할 정수형 1차원 배열 scores 선언
        // scores 에 {80,90,87} 대입
        int[] scores = new int[] {80,90,87};


        PrintItem(scores);
    }
}

/*

import java.util.Scanner;

public class Test {
    public static class Score {
        int[] grade = new int[100];
    }

    public static void InsertScore(Score s, int i, int grade) {
        s.grade[i] = grade;
    }

    public static int total(int a, int b, int c) {
        int total = a + b + c;
        return total;
    }

    public static void PrintGrade(Score s, int sum, float total, int count) {
        System.out.print("점수 : ");
        StringBuilder sb = new StringBuilder();
        for (int num : s.grade) {
            if (num > 0) {
                sb.append(num);
                sb.append(", ");
                sum += num;
                count++;
            }
        }
        System.out.println( sb.delete(sb.length() - 2, sb.length() - 1) );

        total = (float) sum / count;

        System.out.printf("총합 : %d   평균 : %.1f" , sum, total);
    }

    public static void main(String[] args) {
        Score s = new Score();
        Scanner in = new Scanner(System.in);

        int i = 0;
        int sum = 0;
        float total = 0;
        int count = 0;

        /**
         * Receiving any integer inputs.
         * Enter 0 to exit the loop.
         * size of array is set as 100.
         */
/*
        while(i < 100) {
        int grade = in.nextInt();

        if (grade == 0) {
        break;
        } else {
        InsertScore(s, i, grade);
        i++;
        }
        }
        // Print all data
        PrintGrade(s, sum, total, count);

        }
        }
 */


////
/*
import java.util.Arrays;
public class ScoresArrayList {
    static void PrintItem(int[] score){
        int totalValue = Arrays.stream(score).sum();
        double average = Arrays.stream(score).average().orElse(0.0);

        System.out.print("점수 : ");
        for(int i : score ) System.out.print(i + " ");
        System.out.println();
        System.out.printf("총합 : %d 평균 : %.1f", totalValue, average);
    }
    public static void main(String[] args) {
        // 성적을 저장할 정수형 1차원 배열 scores 선언
        int[] score ;

        // scores 에 {80,90,87} 대입
        score = new int[] {80,90,87};

        // 출력시 PrintItem static method를 작성. scores(배열)을 매개값으로 전달하여
        // scores의 항목(점수)를 출력한 후
        // scores의 총합을 구하고 총합과 평균을 출력하세요
        // 출력예시 :
        // 점수 : 80 , 90 , 87
        // 총합 : 00  평균: 00.0  평균은 소수 첫째자리까지

        PrintItem(score);
    }
}*/
