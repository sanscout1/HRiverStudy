package JAVA.Java_Lecture.About_API.PasswordException;

import JAVA.Java_Lecture.About_API.IDException.IDFormatException;
import JAVA.Java_Lecture.About_API.IDException.IDFormatTest;

import java.util.Scanner;

/*
실습5)
아이디와 패스워드를 입력받아 실습3와 실습4에서 작성한 IDCheckException, PasswordCheckException을 예외처리하여
회원가입 프로그램을 완성해주세요.
실습6)
LoginExample 실행 클래스에서
회원 가입된 회원의 아이디와 비밀번호를  비교 확인(NotExitIDWrongPasswordException) 하는 사용자예외 작성하세요.
 */
public class LoginExample {


    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        IDFormatTest idCheck = new IDFormatTest();
        PasswordCheckMain pwdCheck = new PasswordCheckMain();

        try {
            System.out.println("아이디를 입력하세요");
            idCheck.setUserID(in.next());
            System.out.println("비밀번호를 입력하세요");
            pwdCheck.checkPassword(in.next());
            System.out.println("회원가입 성공");
            IsExistIDPWD isExistIDPWD = new IsExistIDPWD(idCheck.getUserID(), pwdCheck.getPassword());
            isExistIDPWD.checkIDPWD();
        } catch (PasswordCheckException | IDFormatException |NotExitIDWrongPasswordException e) {
            e.printStackTrace();
            System.out.println("회원가입 실패");
        } finally {
            System.out.println("아이디,비밀번호 체크 종료");


        }


    }
}
