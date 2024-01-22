package JAVA.Java_assignments.HR_stringAssignment2;

import java.util.Scanner;

public class string9118_ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputString = new String[5];
        for(int i =0; i<5; i++){
            inputString[i]=sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(inputString[i]);
        }
    }
}
