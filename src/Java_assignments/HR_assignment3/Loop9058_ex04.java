package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop9058_ex04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int repeatNum = sc.nextInt();
        String tmpStar ="*";
        String outputStar =tmpStar;
        for(int i=0;i<repeatNum;i++){
            for(int j=0;j<repeatNum-1-i;j++){
                System.out.printf(" ");
            }

            System.out.printf("%s\n",outputStar);
            outputStar+=tmpStar;
        }
    }
}
