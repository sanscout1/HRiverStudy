package JAVA.Java_assignments.HR_stringAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class string9122_ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] sortedString = inputString.split(" ");

        Arrays.sort(sortedString);

        for (int i = 0; i < sortedString.length; i++) {
            System.out.println(sortedString[i]);
        }



    }
}
