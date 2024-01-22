package JAVA.Java_Lecture.About_Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface MathOperation{
    int calculate(int a,int b);
}

interface StringOperation{
    int getLength(String string);
}

interface ArrayOperation{
    int calculateSum(int[] numbers);

}

interface FindMax{
    int getMax(List<Integer> numbers);
}


public class LamdaEx02 {

    public static void main(String[] args) {

        MathOperation addition =(a,b) -> a+b;
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c = addition.calculate(a,b);
        System.out.println(c);

        StringOperation stringOperation = (string) -> string.length();
        int d = stringOperation.getLength("가나다라");


        ArrayOperation arrayOperation = (array) -> Arrays.stream(array).filter(i -> i%2==1).sum();
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arrayOperation.calculateSum(numbers));



        FindMax findMax = (list) -> {

            int maxNumber = Integer.MIN_VALUE;
            for (int i : list) {
                if(i>maxNumber){
                    maxNumber = i;
                }
            }
            return maxNumber;
        };

        List<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            numberList.add(i);
        }

        System.out.println(findMax.getMax(numberList));
        
    }
}
