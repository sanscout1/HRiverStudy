package JAVA.Java_assignments.HR_assignment;

import java.io.*;
import java.util.StringTokenizer;

public class Loop126_ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int oddTotal=0;
        int evenTotal=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){

            int number = Integer.parseInt(st.nextToken());

            if(number%2==0 && number!=0) {
                evenTotal++;
            } else if(number%2==1) {
                oddTotal++;
            } else {

                break;

            }


        }
        bw.write("odd : "+oddTotal+"\n");
        bw.write("even : "+evenTotal+"\n");
        bw.flush();
        bw.close();
    }
}
