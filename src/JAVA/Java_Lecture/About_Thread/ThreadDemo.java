package JAVA.Java_Lecture.About_Thread;

public class ThreadDemo {
    public static void main(String[] args) {

        // t1 t2 생성하여 시작 t1 은 2초마다 쉬면서 동작
        Thread t1 = new Thread(new Threadex11() {});
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        Thread t2 = new Thread(new Threadex11() {});
        t2.start();
        //Thread ex1
        // 1. 자신의 이름을 출력 2. * 20번 출력 3. 이름 종료 메시지 출력
    }

}
class Threadex11 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            System.out.printf("*");
        }
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {}


        System.out.println(Thread.currentThread().getName()+ "종료");

    }
}
