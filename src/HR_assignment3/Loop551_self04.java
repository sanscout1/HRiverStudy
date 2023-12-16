package HR_assignment3;

import java.util.Scanner;

public class Loop551_self04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatNum = sc.nextInt();
        String tmpStar = "*";
        String totalStar = "*".repeat(repeatNum);
        for(int i=0; i<repeatNum; i++){
            for(int j=repeatNum-i;j<repeatNum;j++){
                System.out.printf(" ");
            }
            System.out.printf("%s \n",totalStar);
            totalStar=totalStar.substring(0,totalStar.length()-1);
        }
    }
}
