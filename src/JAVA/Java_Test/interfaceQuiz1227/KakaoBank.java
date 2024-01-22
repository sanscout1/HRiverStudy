package JAVA.Java_Test.interfaceQuiz1227;

public class KakaoBank implements Bank {
    @Override
    public void withDraw(int price) {
        System.out.println("카카오은행만의 인출 로직..."+price+" 원을 인출한다.");

    }

    @Override
    public void deposit(int price) {
        System.out.println("카카오은행만의 인출 로직..."+price+" 원을 인출한다.");

    }
}
