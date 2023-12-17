package Java_assignments.HR_assignment2;

import java.util.Scanner;

public class Loop9052_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total =0;
        float average =0;
        for(int i=0;i<5;i++){
            int tempNum = sc.nextInt();
            total+=tempNum;
        }
        average = (float)total/5;

        System.out.printf("총점 : %d\n",total);
        System.out.printf("평균 : %.1f",average);
    }
}
