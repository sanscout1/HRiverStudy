package HR_assignment2;

import java.util.Scanner;

public class Loop545_self05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeNum =0;
        int fiveNum =0;
        for(int i=0;i<10;i++){
            int tempNum = sc.nextInt();
            if(tempNum%3==0){
                threeNum++;
            }
            if (tempNum%5==0) {
                fiveNum++;
            }
        }
        System.out.printf("Multiples of 3 : %d\n",threeNum);
        System.out.printf("Multiples of 5 : %d",fiveNum);
    }
}
