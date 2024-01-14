package Java_Lecture.About_API;

import Java_Lecture.About_API.PasswordException.PasswordCheckException;

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
           // 우리가 만든 예외처리가 아니라면 메시지 설정이 안된다.

        }

    }
}
