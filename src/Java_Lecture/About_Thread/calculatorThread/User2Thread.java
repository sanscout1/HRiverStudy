package Java_Lecture.About_Thread.calculatorThread;

public class User2Thread extends Thread {
    private CalculatorThreadEx calculator;

    public User2Thread(){
        setName("User2Thread");
    }

    public void setCalculator(CalculatorThreadEx calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory2(50);
    }
}
