package JAVA.Java_assignments.HR_arrayAssignment1;

import java.util.Scanner;

public class array9068_ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] outputArray = new int[100];
        int repeatNum = 0;
        while (repeatNum<100) {

            outputArray[repeatNum] = sc.nextInt();

            if(outputArray[repeatNum] == 0){
                break;
            }
            repeatNum++;

        }

        for(int i=0;i<repeatNum;i++){
            if(i%2==1){
            System.out.printf("%d ",outputArray[i]);
            }
        }

    }
}
