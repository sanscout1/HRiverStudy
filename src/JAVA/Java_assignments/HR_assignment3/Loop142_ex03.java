package JAVA.Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop142_ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();

        String outputStar="*";

        for(int i=0; i<repeatNum;i++){
            for(int j=repeatNum-1-i;j<repeatNum;j++){
                System.out.printf("%s",outputStar);
            }
            System.out.println();
        }
        for(int i=0; i<repeatNum;i++){
            for(int j=i+1;j<repeatNum;j++){
                System.out.printf("%s",outputStar);
            }
            System.out.println();
        }
    }
}
