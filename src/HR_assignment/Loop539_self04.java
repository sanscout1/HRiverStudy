package HR_assignment;

import java.io.*;
import java.util.StringTokenizer;

public class Loop539_self04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalNumber=0;
        int cntNumber=0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            cntNumber++;
            totalNumber += number;
            if(number >=100){
                System.out.println(totalNumber);
                System.out.printf("%.1f",(float)totalNumber/cntNumber);
                break;
            }

        }
    }
}
