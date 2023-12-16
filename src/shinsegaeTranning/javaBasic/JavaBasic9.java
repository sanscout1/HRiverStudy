package shinsegaeTranning.javaBasic;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);

    int studentTotal = 0;
    int[] studentScores ;

    public void checkScoreChoice(int choiceNum){
        switch (choiceNum){
            case 1 -> setStudentTotal();
            case 2 -> setStudentScores();
            case 3 -> getStudentScores();
            case 4 -> informationStudentScores();
            case 5 -> exitProgram();

            default -> {
                System.out.println("다시 입력해주세요");
                checkScoreChoice(sc.nextInt());
            }
        }
    }

    public void setStudentTotal(){
        System.out.println("학생수> ");
        this.studentTotal = sc.nextInt();
    }

    public void setStudentScores (){
        studentScores = new int[this.studentTotal];
        for(int i =0; i<studentTotal;i++){
            System.out.printf("Scores[%d]> ",i);
            studentScores[i]=sc.nextInt();
        }
    }

    public void getStudentScores () {
        for(int i =0; i<studentTotal;i++){
            System.out.printf("scores[%d]: %d\n",i,studentScores[i]);
        }
    }
    public void informationStudentScores() {

        System.out.printf("최고 점수: %d\n", Arrays.stream(studentScores).max().getAsInt());
        System.out.printf("평균 점수: %.1f\n", (float)Arrays.stream(studentScores).average().getAsDouble());
    }

    public void exitProgram(){
        System.out.println("프로그램 종료");
        System.exit(0);
    }



}

public class JavaBasic9 {
    public static void main(String[] args) {

        Scanner choiceScan = new Scanner(System.in);
        Student student = new Student();
        while(true) {
            System.out.println("-------------------------");
            System.out.printf("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료\n");
            System.out.println("-------------------------");
            System.out.println("선택>");
            int choiceNum = choiceScan.nextInt();
            student.checkScoreChoice(choiceNum);

        }
    }
}
