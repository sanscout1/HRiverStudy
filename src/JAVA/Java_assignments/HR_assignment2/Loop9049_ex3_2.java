package JAVA.Java_assignments.HR_assignment2;

import java.util.stream.IntStream;

public class Loop9049_ex3_2 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20).filter(i -> i%2==1).forEach(i ->System.out.print(i+" "));


    }
}
