package Java_assignments.HR_assignment2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop543_self_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntStream.rangeClosed(1,sc.nextInt()).filter(i -> i%2==0).forEach(i-> System.out.print(i+" "));
    }
}
