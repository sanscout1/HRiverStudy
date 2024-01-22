package JAVA.Java_Lecture.About_String;
import java.util.*;
public class About_Ascii {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);


        char t = sc.nextLine().charAt(0);


        if((65<= t)&(t <=90)){
            System.out.println("대문자");
        }
        else if ((97 <= t)&&(t <=122)){
            System.out.println("소문자");
        }

        else if ((48<=t)&&(t<=57)){
            System.out.println("0-9사이의 숫자이군요");
        } else {
            System.out.println("없음");
        }

    }
}
