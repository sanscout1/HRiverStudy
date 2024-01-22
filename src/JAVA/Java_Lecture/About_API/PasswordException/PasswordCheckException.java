package JAVA.Java_Lecture.About_API.PasswordException;
/*
PasswordCheckException을 만들어 보세요.
예외 상황은 비밀번호가 null인 경우,
문자열로만 이루어진 경우, 5자 이하인 경우입니다.
(문자열로만 이루어졌는지 알아보려면 String의 matches() 메서드를 사용하여 주세요. 문자열은 영문자,숫자로 제한합니다.)
 */
public class PasswordCheckException extends Exception{

    public PasswordCheckException(String message){
        super(message);
    }
}
