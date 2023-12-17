package Java_assignments.HR_stringAssignment1;

import java.util.Scanner;

public class string9108_ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char tmpChar = sc.next().charAt(0);

            System.out.println(tmpChar+" -> "+(int)tmpChar);
            if(tmpChar=='0'){
                break;
            }

        }
    }
}
