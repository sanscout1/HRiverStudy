package HR_arrayAssignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class array9075_ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] containerArray = new int[10];

        while (true){
            int tmpNum =sc.nextInt();
            if(tmpNum==0){
                for(int i =0;i<10;i++){
                    if(containerArray[i]>0){
                        System.out.printf("%d : %d개\n",i,containerArray[i]);
                    }
                }
                break;
            }
            tmpNum%=10;
            containerArray[tmpNum]++;
        }
    }
}
