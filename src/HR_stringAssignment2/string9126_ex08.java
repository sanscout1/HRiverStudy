package HR_stringAssignment2;

import java.util.Scanner;

public class string9126_ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString1 = sc.next();
        String inputString2 = sc.next();

        if(inputString1.compareTo(inputString2)>0){
            System.out.printf("%s 가(이) 더 큽니다.\n",inputString1);
        } else {
            System.out.printf("%s 가(이) 더 큽니다.\n",inputString2);        }
        if(inputString1.substring(0,3).equals(inputString2.substring(0,3))){
            System.out.println("앞의 세 문자가 같습니다.");
        } else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }
    }
}
