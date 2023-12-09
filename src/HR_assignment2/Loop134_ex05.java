package HR_assignment2;

import java.util.Scanner;

public class Loop134_ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount =0;

        for (int i=0;i<10;i++){
           int tmpNum =sc.nextInt();
           if(tmpNum%2==0){
               evenCount++;
           } else if (tmpNum%2==1) {
               oddCount++;
           }

        }

        System.out.println("even : "+evenCount);
        System.out.println("odd : "+oddCount);
    }
}
