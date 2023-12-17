package Java_assignments.HR_stringAssignment2;

import java.util.Scanner;

public class string9121_ex03 {
    public static void main(String[] args) {
        String[] savedArray = {"champion","class"};
        Scanner sc = new Scanner(System.in);
        System.out.printf("문자를 입력하세요. ");
        String inputString=sc.nextLine();
        int num =0;
        for (int i = 0; i < savedArray.length; i++) {
            if(savedArray[i].contains(inputString)){
                System.out.println(savedArray[i]);
                num++;
            }
        }

        if(num==0){
            System.out.println("찾는 단어가 없습니다.");
        }


    }
}
