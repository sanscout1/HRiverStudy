package JAVA.Java_assignments.HR_classdiagramAssignment1;

import java.util.Scanner;

public class Hsensor implements Sensor {
    Scanner s = new Scanner(System.in);
    @Override
    public int get() {
        System.out.println("습도를 입력");
        return s.nextInt();
    }
}

