package Java_assignments.HR_stringAssignment1;

import java.util.Scanner;

public class string9115_ex07 {  //22
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmpStr =sc.nextLine();
        String tmpNewStr="";
        for(int i=0;i<tmpStr.length();i++){

            if(tmpStr.charAt(i)<91 && tmpStr.charAt(i)>64){
                tmpNewStr += (char)(tmpStr.charAt(i)+32);
                //replace 는 리턴 값이 문자열임

            }
            else if(tmpStr.charAt(i)<123 && tmpStr.charAt(i)>96) {
                tmpNewStr += (char)(tmpStr.charAt(i)-32);
            }
            else {
                tmpNewStr += tmpStr.charAt(i);
            }

        }

        System.out.println(tmpNewStr);


    }
}
