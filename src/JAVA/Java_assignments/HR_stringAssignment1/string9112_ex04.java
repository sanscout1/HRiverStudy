package JAVA.Java_assignments.HR_stringAssignment1;

import java.util.Scanner;

public class string9112_ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder tmpStrBuilder = new StringBuilder(sc.nextLine());

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n",tmpStrBuilder.length());
        System.out.printf("%s",tmpStrBuilder.reverse());
    }
}
