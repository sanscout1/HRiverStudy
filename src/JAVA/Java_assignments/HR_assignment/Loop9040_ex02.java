package JAVA.Java_assignments.HR_assignment;

import java.util.concurrent.atomic.AtomicInteger;

interface numTotal {
    public int mergeNum(int n);
}


public class Loop9040_ex02 {
    public static void main(String[] args) {
        AtomicInteger num1 = new AtomicInteger(1); //왜 atomic이어야할까
        numTotal numT = (num) -> {
            int total = 0;
            while (num <= 10) {

                total += num;
                num++;

            }
            num1.set(num);
            return total;
        };
        System.out.println("1부터 10까지의 합 = " + numT.mergeNum(num1.get()));
        System.out.println("while문이 끝난 후의 num의 값 = " + num1);
    }
}
