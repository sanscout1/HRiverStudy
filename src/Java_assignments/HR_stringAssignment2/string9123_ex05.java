package Java_assignments.HR_stringAssignment2;

import java.util.Scanner;

public class string9123_ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmpStr1 = sc.nextLine();
        String[] tmpStrArray = tmpStr1.split(" ");
        //        StringBuilder sb1 = new StringBuilder(tmpStr1);
//        StringBuilder sb2 = new StringBuilder(tmpStr2);
// 문제에서 문자열 전체 역순을 원하는 줄 알고 시도 해버림

        //System.out.println(tmpStr1);

//        sb1=sb1.reverse();
//        sb2=sb2.reverse();
        System.out.println(tmpStrArray[1]+tmpStrArray[0]);
    }
}
