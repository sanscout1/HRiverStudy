package HR_assignment;

import javax.imageio.IIOException;
import java.io.*;

public class Loop633_self06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Boolean Flag = true;

        while(Flag){
            bw.write("1. Korea\n");
            bw.write("2. USA\n");
            bw.write("3. Japan\n");
            bw.write("4. China\n");
            bw.write("number?\n");

            bw.flush();

            int chooseNumber = Integer.parseInt(br.readLine());

            switch (chooseNumber) {
                case 1 : bw.write("Seoul\n"); break;
                case 2 : bw.write("Washington\n"); break;
                case 3 : bw.write("Tokyo\n"); break;
                case 4 : bw.write("Beijing\n"); break;
                default: bw.write("none");  Flag=false;

            }
            bw.flush();
        }
    }
}
