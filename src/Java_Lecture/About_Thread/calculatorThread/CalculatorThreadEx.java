package Java_Lecture.About_Thread.calculatorThread;

public class CalculatorThreadEx {
    private int memory;

    public int getMemory() {
        return this.memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        } finally {
            System.out.println(Thread.currentThread().getName() + " : "+ "현재금액 : " + this.memory);

        }
    }
    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }finally {
                System.out.println(Thread.currentThread().getName() + " : " + "현재금액 : " + this.memory);

            }
        }
    }

    public  void setCalculator(CalculatorThreadEx calculator) {

    }
}
