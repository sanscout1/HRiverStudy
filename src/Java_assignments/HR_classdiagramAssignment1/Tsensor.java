package Java_assignments.HR_classdiagramAssignment1;

import java.util.Scanner;

public class Tsensor implements Sensor {
    Scanner s = new Scanner(System.in);
    @Override
    public int get() {
        System.out.println("온도를 입력");
        return s.nextInt();
    }
}

