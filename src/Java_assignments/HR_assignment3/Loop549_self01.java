package Java_assignments.HR_assignment3;

import java.util.Scanner;

public class Loop549_self01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum =0;
        int oddNumCount = 1;
        int streamNum = 1;
        int tmpNum =sc.nextInt();

        while (true){

            totalNum+=streamNum;
            if(totalNum>=tmpNum){
                System.out.printf("%d %d",oddNumCount,totalNum);
                break;
            }
            oddNumCount++;
            streamNum+=2;

        }
    }
}
