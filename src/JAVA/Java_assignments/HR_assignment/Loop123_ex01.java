package JAVA.Java_assignments.HR_assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Loop123_ex01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        IntStream.rangeClosed(1,number).forEach(i->System.out.print(i+" "));
    }
}
