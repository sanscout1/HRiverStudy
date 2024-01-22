package JAVA.Java_assignments.HR_assignment2;

import java.util.Scanner;

public class Loop133_ex04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numCount=sc.nextInt();
        int total=0;
        for(int i=0;i<numCount;i++)
        {
            total+=sc.nextInt();
        }

        System.out.printf("%.2f",(float)total/numCount);
    }
}
