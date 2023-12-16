package HR_assignment3;

import java.util.Scanner;

public class Loop144_ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        String outputStar = "*";
        for (int i =0;i<repeatNum;i++){
            for(int j=(i+1)*2;j<repeatNum*2;j++){
                System.out.printf(" ");
            }
            System.out.println(outputStar);
            outputStar=outputStar+"**";
        }
    }
}
