package Java_assignments.HR_stringAssignment2;

import java.util.Scanner;

public class string9119_ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmpStr =sc.nextLine();
        String[] listSpilt = tmpStr.split(" ");
        for (int i = 0; i < listSpilt.length; i++) {
            System.out.println(listSpilt[i]);
        }
    }
}
