package HR_assignment3;

import java.util.Scanner;

public class Loop145_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        for(int i =0; i<repeatNum;i++){
            int tmpOutputNum = 1;
            for(int k=(i+1)*2;k<repeatNum*2;k++){
                System.out.printf(" ");
            }
            for(int j=repeatNum-i-1;j<repeatNum;j++){
                System.out.printf("%d ",tmpOutputNum);
                tmpOutputNum++;
            }
            System.out.println();
        }
    }
}
