package HR_arrayAssignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array9070_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] outputArray = new Integer[10];
        for (int i=0; i<10;i++){
            outputArray[i] = sc.nextInt();
        }
        Arrays.sort(outputArray, Collections.reverseOrder());

        System.out.println(outputArray[0]);
    }
}
