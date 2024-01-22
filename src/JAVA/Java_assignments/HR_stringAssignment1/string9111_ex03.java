package JAVA.Java_assignments.HR_stringAssignment1;

import java.util.Scanner;

public class string9111_ex03 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String tmpString ="jungol olympiad";

        for(int i =0;i<5;i++){
            System.out.printf("%c",tmpString.charAt(sc.nextInt()));
        }
    }
}
