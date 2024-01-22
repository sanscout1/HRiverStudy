package JAVA.Java_assignments.HR_arrayAssignment2;

import java.util.Scanner;

public class array9078_ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] tmpArray1 = new int[3][3];
        int[][] tmpArray2 = new int[3][3];


        for(int i =0;i<3;i++){
            System.out.printf("첫 번째 배열 %d행 ",i+1);
            for (int j=0;j<3;j++){
                tmpArray1[i][j]=sc.nextInt();
            }
        }

        for(int i =0;i<3;i++){
            System.out.printf("두 번째 배열 %d행 ",i+1);
            for (int j=0;j<3;j++){
                tmpArray2[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.printf("%d ",tmpArray1[i][j]+tmpArray2[i][j]);
            }
            System.out.println();
        }


    }
}
