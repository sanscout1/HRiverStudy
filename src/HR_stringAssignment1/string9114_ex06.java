package HR_stringAssignment1;

import java.util.Scanner;

public class string9114_ex06 {
    public static void main(String[] args) {
        //65~90   97~122
        Scanner sc = new Scanner(System.in);


        while (true){
            char tmpChar = sc.nextLine().charAt(0);
            if(tmpChar>='a' && tmpChar<='z'){
                System.out.println("소문자입니다.");
            } else if (tmpChar>='A' && tmpChar<='Z') {
                System.out.println("대문자입니다.");
            } else if (tmpChar>='1' && tmpChar<='9') {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
