package JAVA.Java_assignments.HR_assignment2;

import java.util.stream.IntStream;

public class Loop9048_ex3_1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20).filter(i -> i%2==1).forEach(i ->System.out.print(i+" "));
    }
}
