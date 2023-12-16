package HR_stringAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class string9127_ex09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] inputStr = new String[5];
        System.out.println("단어 5개를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            inputStr[i]=sc.nextLine();
        }

        Arrays.sort(inputStr);
        for (int i = 0; i < 5; i++) {
            System.out.println(inputStr[i]);
        }




    }
}
