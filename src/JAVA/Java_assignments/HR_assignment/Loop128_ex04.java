package JAVA.Java_assignments.HR_assignment;

import java.io.*;
import java.util.StringTokenizer;

public class Loop128_ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberCount =0;
        while (st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());

            if(number%3!=0 && number%5!=0) {
                numberCount++;
            }

//            if(number==0){
//                break;
//            }

        }

        bw.write(String.valueOf(numberCount));
        bw.flush();
        bw.close();

    }
}
