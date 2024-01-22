package JAVA.Java_assignments.HR_assignment2;

import java.util.Scanner;

public class Loop546_self06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int subjectNum = sc.nextInt();
        int total =0;
        float average =0;
        for(int i=0; i<subjectNum;i++){
            total+=sc.nextInt();
        }
        average=(float)total/subjectNum;

        System.out.printf("avg : %.1f\n",average);
        if(average>=80){
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
