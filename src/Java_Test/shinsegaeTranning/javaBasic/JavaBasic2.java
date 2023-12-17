package Java_Test.shinsegaeTranning.javaBasic;

import java.util.stream.IntStream;

public class JavaBasic2 {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,100).filter( i -> i%3==0).sum());
    }
}
