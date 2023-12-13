package HR_arrayAssignment1;

import java.util.Scanner;

public class array9067_ex03 {
    public static void main(String[] args) {
        int[] outputArray = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i =0; i<10; i++){
            outputArray[i] = sc.nextInt();
        }

        for(int i =0; i<10; i++){

            if(i==2 || i==4 || i==9) {
                System.out.printf("%d ", outputArray[i]);
            }
        }
    }
}
