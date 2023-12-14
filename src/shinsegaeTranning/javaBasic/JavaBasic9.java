package shinsegaeTranning.javaBasic;

import java.util.Arrays;
import java.util.Scanner;

class student {
    Scanner scan = new Scanner(System.in);

    int studentTotal = 0;
    int[] studentScores ;

    public void checkScoreChoice(int choiceNum){

    }

    public void getStudentNum(){
        this.studentTotal = scan.nextInt();
    }

    public void setStudentScores (){
        studentScores = new int[this.studentTotal];
        for(int i =0; i<studentTotal;i++){
            System.out.println("studentScores[i]> ");
            studentScores[i]=scan.nextInt();
        }
    }

    public void getStudentScores () {
        for(int i =0; i<studentTotal;i++){
            System.out.printf("scores[%d]: %d",i,studentScores[i]);
        }
    }
    public void informationStudentScores() {
        System.out.printf("최고 점수: %d\n",);
    }



}

public class JavaBasic9 {
    public static void main(String[] args) {

        Scanner choiceScan = new Scanner(System.in);
        int choiceNum = choiceScan.nextInt();
        while(true) {
            System.out.println("-------------------------");
            System.out.printf("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------");
            System.out.println("선택>");

        }
    }
}
