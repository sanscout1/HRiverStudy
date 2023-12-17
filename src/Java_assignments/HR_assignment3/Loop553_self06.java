package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop553_self06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        char repeatChar = 'A';
        for(int i =0; i<repeatNum; i++){
            for(int j=0+i;j<repeatNum;j++){
                System.out.printf("%s",repeatChar);
                repeatChar++;
            }
            System.out.println();
        }
    }
}
