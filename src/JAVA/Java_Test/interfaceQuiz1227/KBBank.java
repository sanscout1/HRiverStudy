package JAVA.Java_Test.interfaceQuiz1227;

public class KBBank implements Bank{

    @Override
    public String findDormancyAccount(String custId) {
        System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
        System.out.println("**금융결제원에서 제공하는 로직**");
        return "KB은행 000-000-0000-00";
    }

    @Override
    public void withDraw(int price) {
        System.out.println("KB은행만의 인출 로직..."+price+" 원을 인출한다.");
    }

    @Override
    public void deposit(int price) {
        System.out.println("KB은행만의 인출 로직..."+price+" 원을 입금한다.");
    }



}
