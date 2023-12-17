package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop9061_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNum = sc.nextInt();
        int outputNum = 1;
        for (int i = 0; i < lineNum; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.printf("%d ",outputNum);
                outputNum++;
            }
            System.out.println(" ");

        }
    }
}
