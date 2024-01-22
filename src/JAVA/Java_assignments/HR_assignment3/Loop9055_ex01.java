package JAVA.Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop9055_ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumBorderNumber = sc.nextInt();
        int tmpNum=1;
        int totalNum=0;
        while(true){
            totalNum+=tmpNum;
            tmpNum++;

            if(totalNum>sumBorderNumber){
                System.out.printf("%d %d",tmpNum-1,totalNum);
                break;
            }
        }
    }
}
