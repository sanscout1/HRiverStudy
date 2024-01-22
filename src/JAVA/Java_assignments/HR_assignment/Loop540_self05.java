package JAVA.Java_assignments.HR_assignment;

import java.io.*;

public class Loop540_self05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        while(true){
            int number = Integer.parseInt(br.readLine());
            //System.out.println(number%3);
            if(number%3==0){
                bw.write(Integer.toString(number/3)+"\n");
                bw.flush();
            }

            if(number==-1){
                break;
            }
        }
    }
}
