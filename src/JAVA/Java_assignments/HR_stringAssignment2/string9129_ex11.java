package JAVA.Java_assignments.HR_stringAssignment2;

import java.util.Scanner;

public class string9129_ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString1 = sc.next();
        String inputString2 = sc.next();
        String inputString3 = sc.next();

        inputString1 = String.format("%.2f",Double.parseDouble(inputString1));
        inputString2 = String.format("%.2f",Double.parseDouble(inputString2));
        inputString3 = String.format("%.2f",Double.parseDouble(inputString3));

        String inputStringMerge = inputString1+inputString2+inputString3;

        String[] inputStringArray = inputStringMerge.split("\\.");

        for (String s : inputStringArray) {
            System.out.println(s);
        }
    }
}
