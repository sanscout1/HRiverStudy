package HR_stringAssignment2;

import java.util.Scanner;

public class string9124_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr =sc.nextLine();
        String[] tmpStrArray = inputStr.split(" ");

        String tmpStr = tmpStrArray[0].substring(0,3);
        //System.out.println(tmpStr);
        tmpStrArray[1]=tmpStrArray[1]+tmpStr;
        tmpStr = tmpStrArray[1].substring(0,3);

        StringBuilder tmpSb = new StringBuilder(tmpStrArray[0]);
        tmpStrArray[0]=tmpStr+tmpSb.delete(0,3);
        System.out.println(tmpStrArray[0]);
        System.out.println(tmpStrArray[1]);
    }
}
