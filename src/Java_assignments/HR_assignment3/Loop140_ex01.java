package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop140_ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNum =0;
        int countNum =0;

        for(int i=0;i<20;i++){
            int tmpNum = sc.nextInt();
            if(tmpNum==0){
                break;
            }
            totalNum+=tmpNum;
            countNum++;
        }

        System.out.printf("%d %d",totalNum,(int)totalNum/countNum);
    }
}
