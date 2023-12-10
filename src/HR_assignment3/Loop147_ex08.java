package HR_assignment3;

import java.util.Scanner;

public class Loop147_ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        int initialNum = 1;
        for(int i =0; i<repeatNum;i++){
            for(int k=repeatNum-i; k<repeatNum;k++){
                System.out.printf("  ");
            }
            for(int j=i;j<repeatNum;j++){
                System.out.printf("%d ",initialNum);
                initialNum++;
            }
            System.out.println();
        }
    }
}
