package Java_assignments.HR_arrayAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class array9072_ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = new int[10];

        for(int i =0; i< 10;i++){
            inputArray[i]=sc.nextInt();
        }

        System.out.printf("총점 = %d\n",Arrays.stream(inputArray).sum());
        System.out.printf("평균 = %.1f",Arrays.stream(inputArray).average().getAsDouble());
    }
}
