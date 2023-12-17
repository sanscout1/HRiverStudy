package Java_assignments.HR_arrayAssignment2;

import java.util.Scanner;

public class array9074_ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] containerArray = new int[11];
        while (true){

            int tmpNum = sc.nextInt();
            if(tmpNum>10 || tmpNum<1){
                for(int i=1;i<11;i++){
                    if(containerArray[i]!=0) {
                        System.out.printf("%d : %d개\n", i, containerArray[i]);
                    }
                }
                break;
            }
            containerArray[tmpNum]++;


        }
    }
}
