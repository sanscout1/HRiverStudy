package Java_assignments.HR_assignment2;

import java.util.Scanner;

public class Loop9051_ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum=0;
        for(int i=0;i<11; i++ ) {
            int tempNum = sc.nextInt();
            if(tempNum%2 ==0){
                totalNum++;
            }
        }
        System.out.printf("입력받은 짝수는 %d개입니다.",totalNum);
    }
}
