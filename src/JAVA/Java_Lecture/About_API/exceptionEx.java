package JAVA.Java_Lecture.About_API;

import java.util.Scanner;

public class exceptionEx {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        try {
        for (int i = 0; i < 6; i++) {
            array[i]=in.nextInt();
        }

        } catch(ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
           new ArrayIndexOutOfBoundsException("아아아");
            // 정해진 예외처리만 이용 가능함
        }

    }
}
