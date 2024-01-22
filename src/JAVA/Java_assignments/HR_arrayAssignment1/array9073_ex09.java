package JAVA.Java_assignments.HR_arrayAssignment1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class array9073_ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] outputIntArray = {95,75,85,100,50};
        outputIntArray= Arrays.stream(outputIntArray).sorted().toArray();

        IntStream outputIntstream = Arrays.stream(outputIntArray);

        outputIntstream.forEach(i->System.out.printf("%d ",i));
    }
}
