package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop146_ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        char initialChar = 'A';
        int initialInt = 0;
        for(int i =0; i<repeatNum;i++){
            for(int j=i; j<repeatNum; j++){
                System.out.printf("%c ",initialChar);
                initialChar++;
            }
            for(int k=repeatNum-i;k<repeatNum;k++){
                System.out.printf("%d ",initialInt);
                initialInt++;
            }
            System.out.println();
        }
    }
}
