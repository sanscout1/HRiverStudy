package JAVA.Java_assignments.HR_assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Loop9043_ex05_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberTotal = 0;
        int numberCount = 0;

        while(st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            if(number%2==1) {
                numberTotal += number;
                numberCount++;
            }
            if(number==0){
                System.out.println("홀수의 합 = "+ numberTotal);
                System.out.printf("홀수의 평균 = %d",(int)numberTotal/numberCount);
                break;
            }
        }





    }
}
