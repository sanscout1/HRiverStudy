package HR_assignment;

import java.io.*;
import java.util.StringTokenizer;

public class Loop9042_ex04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Boolean Flag = true;
        int totalNumber = 0;
        int cntNumber =0;


        StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int number = Integer.parseInt(st.nextToken());
                if(number ==0){
                    break;
                }
                cntNumber++;
                totalNumber += number;

            }

                System.out.println("입력된 자료의 개수 = "+cntNumber);
                System.out.println("입력된 자료의 합계 = "+totalNumber);
                System.out.printf("입력된 자료의 평균 = %.2f",(float)totalNumber/cntNumber);





    }
}
