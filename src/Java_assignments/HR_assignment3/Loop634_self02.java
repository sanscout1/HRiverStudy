package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop634_self02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        String tmpStar ="*";
        String outputStar =tmpStar;
        for(int i=0;i<repeatNum;i++)
        {
            System.out.println(outputStar);
            outputStar+=tmpStar;
        }
    }
}
