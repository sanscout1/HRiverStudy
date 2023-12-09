package HR_assignment2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop132_ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fiveSum= IntStream.rangeClosed(1,sc.nextInt()).filter( i -> i%5==0).sum();
        System.out.println(fiveSum);
    }
}
