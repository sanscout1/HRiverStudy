package JAVA.Java_assignments.HR_assignment;

import java.io.*;

public class Loop9041_ex03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        boolean Flag = true;
        while (Flag) {
            System.out.print("점수를 입력하세요. ");
            int score = Integer.parseInt(br.readLine());
            bw.write(score);
            if (score >= 80&& score <= 100) {
                System.out.println("축하합니다. 합격입니다.");
            } else if(score>0 && score <80) {
                System.out.println("죄송합니다. 불합격입니다.");
            } else {
                bw.flush();
                break;
            }
        }
    }
}
