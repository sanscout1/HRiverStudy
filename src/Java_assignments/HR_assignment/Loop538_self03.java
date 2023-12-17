package Java_assignments.HR_assignment;

import java.io.*;

public class Loop538_self03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean Flag = true;

        while(Flag) {
            System.out.print("number? ");
            int number = Integer.parseInt(br.readLine());
            if(number>0) {
                System.out.println("positive integer");
            } else if(number<0) {
                System.out.println("negative number");
            } else {
                break;
            }


        }
    }
}
