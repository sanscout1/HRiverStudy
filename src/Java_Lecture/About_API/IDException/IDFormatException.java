package Java_Lecture.About_API.IDException;

// 아이디가 null이거나 지정범위를 벗어난 아이디가 입력되었을 경우 발생시키는 사용자 정의 예외클래스

public class IDFormatException extends Exception{
        public IDFormatException(String message){
            super(message);
        }

        // 예외 상황 메세지를 생성자에서 입력받는다.
    //  exception 클래스에서 메시지 생성자, 멤버 변수, 메소드를 제공받음,
}
