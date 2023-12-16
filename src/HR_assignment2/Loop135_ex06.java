package HR_assignment2;

import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop135_ex06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();

        if(num1>num2){
            int tmp = num1;
            num1 = num2;
            num2 = tmp;
        }

        int sum = IntStream.rangeClosed(num1, num2).filter( i -> ( (i%3==0) || (i%5==0))).sum();
        double avg = IntStream.rangeClosed(num1,num2).filter(i -> ( (i%3==0) || (i%5==0))).average().getAsDouble();

        System.out.println("sum : "+sum);
        System.out.printf("avg : %.1f",(float)avg);
    }
}
