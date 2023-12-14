package HR_stringAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class string9116_ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] spiltArray =inputString.split(" ");

        for(int i=0; i<spiltArray.length;i++){
            System.out.println(spiltArray[i]);

        }

    }
}
