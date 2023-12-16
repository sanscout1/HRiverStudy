package HR_stringAssignment1;

import java.util.Scanner;

public class string9117_ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String OutputString =sc.nextLine();




        for(int j =0; j<OutputString.length();j++) {
            char tmpChar = OutputString.charAt(0);
            String tmpString = "";
            for (int i = 0; i < OutputString.length() - 1; i++) {
                tmpString = tmpString + OutputString.charAt(i + 1);
            }
            tmpString = tmpString + tmpChar;
            OutputString =tmpString;

            System.out.println(OutputString);
        }
    }
}
