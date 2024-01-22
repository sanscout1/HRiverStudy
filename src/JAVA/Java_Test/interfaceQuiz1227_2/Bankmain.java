package JAVA.Java_Test.interfaceQuiz1227_2;

public class Bankmain {
    public static void main(String[] args) {
        HappyBank happyBank = new HappyBank();
        happyBank.doPersonalFinance();
        happyBank.doEnterpriseFinance();

        UnhappyBank unhappyBank = new UnhappyBank();
        unhappyBank.doPrivateBanking();
        unhappyBank.doPersonalFinance();
        unhappyBank.doEnterpriseFinance();
    }
}
