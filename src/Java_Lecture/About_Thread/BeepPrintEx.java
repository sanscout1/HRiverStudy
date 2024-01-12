package Java_Lecture.About_Thread;


import java.awt.*;

//main 이 동시에 두가지 작업을 처리할 수 있는지 코드로 확인
public class BeepPrintEx {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("삐");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }
}
