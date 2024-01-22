package JAVA.Java_assignments.HR_assignment;

import java.util.stream.IntStream;

public class Loop9039_ex01 {
    public static void main(String[] args) {
        //65

            char[] alphabet = new char[28];
        IntStream.range(65,91).forEach(value-> System.out.print((char)value));
    }
}
