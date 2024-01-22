package JAVA.Java_Lecture.About_Thread;


import java.awt.*;

//main 이 동시에 두가지 작업을 처리할 수 있는지 코드로 확인
public class BeepPrintThread {
    public static void main(String[] args) {

        Thread thread = new Thread() {
            //(new Runnable)  지우니까 getid name 메서드 이용가능
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                setName("나는 쓰레드다");
                System.out.println(getId() + " 쓰레드 " + getName());
                for (int i = 0; i < 10; i++) {
                    System.out.println("삐2");
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {

                    }
                }
            }
        }; thread.start();
        System.out.println(thread.getId() + " 쓰레드 명령 밖" + thread.getName());
        Thread maintThread = Thread.currentThread();
        System.out.println(maintThread.getId() + " " + maintThread.getName());
        // 메인문과 동시에 작동, 메인문 작업이 끝나도 진행함
        // 자바는 모든 쓰레드에 우선순위 (Priority) 를 기본값 5를 줌
        // 메인문이 만약 다 실행된다면, 자바는 알아서 wait을 시켜버린다. 자식이 종료될 때 까지
        // 정교한 멀티 쓰레드 프로세스는 c++에서나 하자

        for (int i = 0; i < 5; i++) {
            System.out.println("삐");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }


    }
}
