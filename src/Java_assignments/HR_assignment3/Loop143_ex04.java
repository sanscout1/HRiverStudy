package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop143_ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        String outputStar = "*".repeat((repeatNum-1)*2+1);

        for(int i=0;i<repeatNum;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(outputStar);
            if(i!=repeatNum-1) {
                outputStar = outputStar.substring(0, outputStar.length() - 2);
            }
        }

        for(int i=0;i<repeatNum;i++){
            for(int j=0;j<repeatNum-2-i;j++){
                System.out.print(" ");
            }
            if(i!=repeatNum-1) {
                outputStar = outputStar+"**";
            } else {
                break;
            }
            System.out.println(outputStar);

        }
    }
}
