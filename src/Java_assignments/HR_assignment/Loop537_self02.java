package Java_assignments.HR_assignment;

import java.io.*;
import java.util.stream.IntStream;

public class Loop537_self02 {
    public static void main(String[] args) throws IOException {
        //mapoint filter  stream 메소드들 활용

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int number1 = Integer.parseInt(bf.readLine());

        int total = IntStream.range(1,number1+1).sum();

        bw.write(String.valueOf(total));
        bw.flush();

    }
}
