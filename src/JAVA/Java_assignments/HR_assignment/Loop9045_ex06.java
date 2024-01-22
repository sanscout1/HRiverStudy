package JAVA.Java_assignments.HR_assignment;

import java.io.*;

public class Loop9045_ex06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Boolean Flag = true;

        while (Flag) {
            bw.write("1. 입력하기\n");
            bw.write("2. 출력하기\n");
            bw.write("3. 삭제하기\n");
            bw.write("4. 끝내기\n");
            bw.write("작업할 번호를 선택하세요.\n");
            bw.flush();
            int chooseNumber = Integer.parseInt(br.readLine());

            switch (chooseNumber) {
                case 1 -> bw.write("입력하기를 선택하였습니다.\n");
                case 2 -> bw.write("출력하기를 선택하였습니다.\n");
                case 3 -> bw.write("삭제하기를 선택하였습니다.\n");
                case 4 -> {bw.write("끝내기를 선택하였습니다.");  Flag = false; }
                default -> bw.write("잘못 입력하였습니다.\n");

            }
            bw.flush();
            bw.close();
        }
    }
}
