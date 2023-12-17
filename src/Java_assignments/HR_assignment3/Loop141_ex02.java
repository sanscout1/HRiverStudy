package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop141_ex02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int multipleNum = sc.nextInt();
        int outputNum=0;
        int TmpNum =0;
        while (true){
            TmpNum++;
            outputNum=multipleNum*TmpNum;
            if(outputNum>100){
                break;
            }
            System.out.printf("%d ",outputNum);
            if(outputNum%10==0){
                break;
            }

        }
    }
}
