package Java_assignments.HR_assignment2;

import java.util.Scanner;

public class Loop137_ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int column = sc.nextInt();

        for(int i=0; i<row;i++ ){
            for (int j=1; j<column+1;j++){
                System.out.printf("%d ",(i+1)*j);
            }
            System.out.println();
        }
    }
}
