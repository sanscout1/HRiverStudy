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
//            if(password == null) {
//                throw new PasswordCheckException("비밀면호 입력이 없습니다.");
//            } else if (password.length() < 6) {
//                throw new PasswordCheckException("비밀번호가 5자 이하 입니다");
//
//            } else if (!password.matches("[a-zA-Z0-9]*")) {
//                throw new PasswordCheckException("옳지 않은 비밀번호 입니다");
//            }else {
//                System.out.println("옳은 비밀번호 입니다.");
//                this.password=password;
//            }
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
//        catch (PasswordCheckException e)
//        {
//
//        }
    }
}
