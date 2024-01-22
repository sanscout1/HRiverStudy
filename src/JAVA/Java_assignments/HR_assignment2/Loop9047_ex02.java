package JAVA.Java_assignments.HR_assignment2;

import java.util.stream.IntStream;

public class Loop9047_ex02 {
    public static void main(String[] args) {
        IntStream.rangeClosed(65,90).mapToObj(i -> (char) i).forEach(System.out::print);

    }
}
