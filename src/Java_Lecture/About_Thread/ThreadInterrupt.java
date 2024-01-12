package Java_Lecture.About_Thread;

import javax.swing.*;

// interrupt 메서드 : 쓰레드를 안전하게 종료시킬 때 사용한다. 스레드를 실행 도중 종료시키고 싶을때 사용
public class ThreadInterrupt {

        public static void main(String[] args) throws InterruptedException {

            // t1 t2 생성하여 시작 t1 은 2초마다 쉬면서 동작
            Thread t1 = new Thread(new Threadex111());
            t1.start();
            String yes = JOptionPane.showInputDialog("게임 다시 진행? [Y/N]");
            System.out.println(yes);
            t1.interrupt();
            System.out.println("isInterrupted: " + t1.isInterrupted());
//            Thread.sleep(2000);
//            System.out.println("isInterrupted: " + t1.isInterrupted());



        }

    }
    class Threadex111 implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            int i = 10;
            while(!Thread.currentThread().isInterrupted()){

                System.out.println(Thread.currentThread().isInterrupted());
                        // isInterrupted 는 runnable 에 없음
                //  Thread에 존재하니 runnable일 때는 currentThread() 를 부르자
                System.out.println(i--);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                }
                for (long x= 0; x< 2500000000L;x++){}

                // sleep 은 runnable 상태가 아니고 wait 상태라 interrupt 가 초기화 되는듯

            }
            System.out.println(Thread.currentThread().getName()+ "종료");
        }
    }



