package JAVA.Java_assignments.HR_assignment2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop131_ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmpNum1 = sc.nextInt();
        int tmpNum2 = sc.nextInt();

        if (tmpNum1 > tmpNum2) {
            IntStream.rangeClosed(tmpNum2, tmpNum1).forEach(i -> System.out.print(i + " "));
        } else {
            IntStream.rangeClosed(tmpNum1, tmpNum2).forEach(i -> System.out.print(i + " "));
        }

    }
}
