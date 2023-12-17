package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop552_self05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        int repeatTotalNum=1;
        char tmpStar ='*';
        for(int i=0;i<repeatNum-1;i++){
            repeatTotalNum+=2;
        }
        String outputStar ="*".repeat(repeatTotalNum);

        for(int i=0; i<repeatNum;i++){
            for(int j=repeatNum-i;j<repeatNum;j++){
                System.out.printf(" ");
            }
            System.out.println(outputStar);
            if(outputStar.length()>1){
                outputStar=outputStar.substring(0,outputStar.length()-2);

            }
        }

    }
}
