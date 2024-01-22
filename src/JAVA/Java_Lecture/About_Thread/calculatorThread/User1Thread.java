package JAVA.Java_Lecture.About_Thread.calculatorThread;

public class User1Thread extends Thread {
    private CalculatorThreadEx calculator;

    public User1Thread(){
        setName("User1Thread");
    }

    public void setCalculator(CalculatorThreadEx calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory1(100);
    }
}
