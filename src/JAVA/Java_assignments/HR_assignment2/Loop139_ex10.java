package JAVA.Java_assignments.HR_assignment2;

import java.util.Scanner;

public class Loop139_ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum =sc.nextInt();

        if(startNum > endNum){

                for(int j=1;j<10;j++) {
                    for (int i = startNum; i >= endNum; i--) {
                        System.out.printf("%d * %d = %2d   ", i, j, i * j);
                    }
                    System.out.println();
                }

        }
        else {
            for(int j=1;j<10;j++) {
                for (int i = startNum; i <= endNum; i++) {
                    System.out.printf("%d * %d = %2d   ", i, j, i * j);
                }
                System.out.println();
            }

        }
    }
}
