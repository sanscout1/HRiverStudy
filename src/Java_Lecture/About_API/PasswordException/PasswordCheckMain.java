package Java_Lecture.About_API.PasswordException;

import java.io.IOException;
import java.util.Scanner;

public class PasswordCheckMain {
    static Scanner in = new Scanner(System.in);
    
    private String password;
    public String getPassword(){
        return this.password;
    }
    public void checkPassword(String password) throws PasswordCheckException {
        if(password == null) {
            throw new PasswordCheckException("비밀면호 입력이 없습니다.");
        } else if (password.length() < 6) {
            throw new PasswordCheckException("비밀번호가 5자 이하 입니다");

        } else if (!password.matches("[a-zA-Z0-9]*")) {
            throw new PasswordCheckException("옳지 않은 비밀번호 입니다");
        }else {
            System.out.println("옳은 비밀번호 입니다.");
            this.password=password;
        }
    }

    public static void main(String[] args) {
        String tmpPwd = null;
        PasswordCheckMain passwordCheckMain = new PasswordCheckMain();
        try{
            tmpPwd=in.next();
            passwordCheckMain.checkPassword(tmpPwd);
        } catch (PasswordCheckException e) {
            e.printStackTrace();
        } catch (Exception e1){
            e1.printStackTrace();
        }
        finally {
            System.out.println("프로그램 종료");
        }
    }
}
