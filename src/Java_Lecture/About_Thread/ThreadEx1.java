package Java_Lecture.About_Thread;

public class ThreadEx1 {

    public static void main(String[] args) {
        // 상속으로 Thread 생성
        ThreadByInheritance t1 = new ThreadByInheritance();


        // runnable interface 로 thread 생성
        Runnable r2 = new ThreadByImplement();
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(new ThreadByImplement());

        t1.start();
        t2.start();
    }

}

class ThreadByInheritance extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print(0);
        }
    }
}

class ThreadByImplement implements Runnable {

    @Override
    public void run() {

            for (int i = 0; i < 500; i++) {
                System.out.print(1);

        }
    }
}
