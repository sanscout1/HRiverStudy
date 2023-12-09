package HR_assignment2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop9050_ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=IntStream.rangeClosed(1,sc.nextInt()).sum();
        System.out.println(total);
    }
}
