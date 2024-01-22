package JAVA.Java_assignments.HR_assignment2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop544_self04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=IntStream.rangeClosed(sc.nextInt(),100).sum();
        System.out.println(total);
    }
}
