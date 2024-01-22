package JAVA.Java_Lecture.About_Thread.calculatorThread;

public class SychronizedMain {
    public static void main(String[] args) {
        CalculatorThreadEx calculatorThreadEx = new CalculatorThreadEx();

        User1Thread user1 = new User1Thread();
        user1.setCalculator(calculatorThreadEx);
        user1.start();

        User2Thread user2 = new User2Thread();
        user2.setCalculator(calculatorThreadEx);
        user2.start();

    }
}
