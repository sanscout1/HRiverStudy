package Java_assignments.HR_arrayAssignment1;

import java.util.Scanner;

public class array9063_ex01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tmpNum ;
        int[] outputArray = new int[5];
        for (int i = 0; i< outputArray.length;i++){
            outputArray[i]= sc.nextInt();
        }

        for(int i = 0; i<outputArray.length; i++){
            System.out.printf("%d ",outputArray[i]);
        }
    }
}
