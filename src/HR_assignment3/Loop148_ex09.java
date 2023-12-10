package HR_assignment3;

import java.util.Scanner;

public class Loop148_ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum =sc.nextInt();

        for(int i =0; i< repeatNum;i++){
            for(int j=repeatNum-i-1;j<repeatNum;j++) {
                System.out.printf("# ");
            }
            System.out.println();
        }
        for(int i=1;i<repeatNum;i++){
            for(int k=repeatNum-i; k<repeatNum;k++){
                System.out.printf("  ");
            }
            for(int j=i;j<repeatNum;j++){
                System.out.printf("# ");
            }
            System.out.println();
        }
    }
}
