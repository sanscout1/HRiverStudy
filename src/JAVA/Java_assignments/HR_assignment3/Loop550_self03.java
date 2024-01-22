package JAVA.Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop550_self03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        String tmpStar = "*";
        String outputStar = "";

        for (int i = 0; i < repeatNum; i++) {
            outputStar += tmpStar;
        }

        for(int i =0; i<repeatNum;i++){
            System.out.println(outputStar);
            outputStar=outputStar.substring(0,outputStar.length()-1);
        }

        for(int i=0;i<repeatNum;i++){
            outputStar+=tmpStar;
            System.out.println(outputStar);

        }
    }
}
