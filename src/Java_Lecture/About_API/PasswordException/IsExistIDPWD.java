package Java_Lecture.About_API.PasswordException;

import Java_Lecture.About_API.IDException.IDFormatTest;

import java.util.Scanner;

public class IsExistIDPWD {
    static Scanner in = new Scanner(System.in);

    private String ID;
    private String PWD;
    IsExistIDPWD(String ID,String PWD){
        this.ID=ID;
        this.PWD=PWD;
    }

    public void checkIDPWD() throws NotExitIDWrongPasswordException{
        String id2;
        String pwd2;

        System.out.println("아이디를 확인해보세요");
        id2 = in.next();
        if(!id2.equals(ID)) {
            throw new NotExitIDWrongPasswordException("아이디가 틀립니다.");
        }
        System.out.println("비밀번호를 확인해보세요");
        pwd2 = in.next();
        if(!pwd2.equals(PWD) ){
            throw new NotExitIDWrongPasswordException("비밀번호가 틀립니다.");
        }
        System.out.println("둘다 동일 합니다.");
    }



}
