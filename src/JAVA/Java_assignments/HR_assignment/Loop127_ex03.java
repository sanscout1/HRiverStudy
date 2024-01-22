package JAVA.Java_assignments.HR_assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Loop127_ex03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int numTotal =0;
        int numCount =0;

        while(st.hasMoreTokens()) {
            int number = Integer.parseInt(st.nextToken());

            if(number>100 || number<0){
                break;
            }

            numCount++;
            numTotal+=number;

        }
        System.out.println("sum : "+numTotal);
        System.out.printf("avg : %.1f",(float)numTotal/numCount);
    }
}
