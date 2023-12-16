package HR_stringAssignment2;

import java.util.Scanner;

public class string9125_ex07 {
    public static void main(String[] args) {
        String[] tmpStrArray = {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};

        Scanner sc = new Scanner(System.in);
        System.out.printf("문자를 입력하세요. ");
        String tmpChar = sc.nextLine();
        int existTotal = 0;
        for (int i = 0; i < tmpStrArray.length; i++) {
            if(tmpStrArray[i].contains(tmpChar)){
                System.out.println(tmpStrArray[i]);
                existTotal++;
            }
        }
        if(existTotal==0){
            System.out.println("찾는 단어가 없습니다.");
        }
        System.out.println();
        System.out.printf("문자열을 입력하세요. ");
        tmpChar = sc.nextLine();
        existTotal=0;
        for (int i = 0; i < tmpStrArray.length; i++) {
            if(tmpStrArray[i].contains(tmpChar)){
                System.out.println(tmpStrArray[i]);
                existTotal++;
            }
        }
        if(existTotal==0){
            System.out.println("찾는 단어가 없습니다.");
        }
    }
}
