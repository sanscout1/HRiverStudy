package JAVA.Java_assignments.HR_assignment2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop136_ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmpNum = sc.nextInt();
        IntStream.rangeClosed(tmpNum,tmpNum*10).filter( i -> i%tmpNum==0).forEach(i -> System.out.printf(i+" "));
    }
}
