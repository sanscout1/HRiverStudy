package Java_assignments.HR_classdiagramAssignment1;

import java.util.Scanner;

public class Rsensor implements Sensor{

    Scanner s = new Scanner(System.in);
    @Override
    public int get() {
        System.out.println("강수량을 입력");
        return s.nextInt();
    }
}
