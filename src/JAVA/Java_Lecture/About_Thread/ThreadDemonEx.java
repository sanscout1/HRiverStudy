package JAVA.Java_Lecture.About_Thread;

public class ThreadDemonEx {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("current thread = " + t1);

        Thread t2 = new Thread(new ThreadEx01() );
        System.out.println("t2 :"+ t2);

    }
}

class ThreadEx01 implements  Runnable{

    @Override
    public void run() {

    }
}
