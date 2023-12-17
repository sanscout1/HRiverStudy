package Java_assignments.HR_stringAssignment2;

import java.util.Scanner;

public class string9128_ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String inputStr1 = sc.next();
            String inputStr2 = sc.next();


            if (inputStr1.contains(".")) {
                inputStr1 = String.format("%.2f", Double.parseDouble(inputStr1));
                inputStr2 = String.format("%.2f", Double.parseDouble(inputStr2));
                System.out.printf("%.2f + %.2f = %.2f\n", Double.parseDouble(inputStr1), Double.parseDouble(inputStr2),
                        Double.parseDouble(inputStr1) + Double.parseDouble(inputStr2));
            } else {
                System.out.printf("%d + %d = %d\n", Integer.parseInt(inputStr1), Integer.parseInt(inputStr2),
                        Integer.parseInt(inputStr1) + Integer.parseInt(inputStr2));
            }
        }
    }
}
