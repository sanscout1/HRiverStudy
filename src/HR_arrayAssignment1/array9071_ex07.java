package HR_arrayAssignment1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class array9071_ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] outputArray = new Integer[10];

        for(int i = 0 ; i< 10; i++){
            outputArray[i] = sc.nextInt();
        }

        Arrays.sort(outputArray);
        int maxIndex =9;
        int minIndex =0;

        int maxEven = outputArray[maxIndex];
        int minOdd = outputArray[minIndex];

        while(abs(maxEven)%2 !=0) {
            maxIndex--;
            maxEven = outputArray[maxIndex];
           // System.out.println(maxEven);
        }

        while(abs(minOdd)%2 != 1 ){
            minIndex++;
            minOdd = outputArray[minIndex];
           // System.out.println(minOdd);
        }

        System.out.printf("%d %d",minOdd,maxEven);

    }
}
