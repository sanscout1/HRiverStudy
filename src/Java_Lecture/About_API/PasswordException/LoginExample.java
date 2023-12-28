package Java_Lecture.About_API.PasswordException;

import Java_Lecture.About_API.IDException.IDFormatException;
import Java_Lecture.About_API.IDException.IDFormatTest;

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
    public static <string> void main(String[] args) {
        String id;
        String pwd;

        IDFormatTest idCheck = new IDFormatTest();
        PasswordCheckMain pwdCheck = new PasswordCheckMain();

        try {
            System.out.println("아이디를 입력하세요");
            idCheck.setUserID(in.next());
            System.out.println("비밀번호를 입력하세요");
            pwdCheck.checkPassword(in.next());
            System.out.println("회원가입 성공");
        } catch (PasswordCheckException | IDFormatException e) {
            e.printStackTrace();
            System.out.println("회원가입 실패");
        } finally {
            System.out.println("회원가입 종료");
        }

        String id2;
        String pwd2;
        try {
            System.out.println("아이디를 확인해보세요");
            id2 = in.next();
            if(!id2.equals(idCheck.getUserID())) {
                throw new NotExitIDWrongPasswordException("아이디가 틀립니다.");
            }
            System.out.println("비밀번호를 확인해보세요");
            pwd2 = in.next();
            if(!pwd2.equals(pwdCheck.getPassword()) ){
                throw new NotExitIDWrongPasswordException("비밀번호가 틀립니다.");
            }
            System.out.println("둘다 동일 합니다.");
        } catch (NotExitIDWrongPasswordException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("아이디,비밀번호 체크 종료");
        }
    }
}
