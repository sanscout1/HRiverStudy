package Java_Lecture.About_API;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception01 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLength("자바프로그램입니다.");
        printLength(null);

        int[] array = new int[5];
        ArrayIndexCheck(array);

        FileInput();


        System.out.println("프로그램 종료");
    }

    static void printLength(String s){  //try catch 없으면 프로그램 종료 출력 못봄
        try {
            int result = s.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());  //예외 출력방식 1 : 에러의 원인을 간단하게 출력
            System.out.println("입력 데이터가 잘못되었습니다. 다시 입력해 주세요. ");  //예외 출력방식 2
            System.out.println(e.toString());  //예외 출력방식 2 : exception의 내용과 원인 출력
            e.printStackTrace(); // 예외 출력방식 3 : 에러의 발생 근원지를 찾아 단계별로 에러를 출력
        }
    }

    static void ArrayIndexCheck(int[] array){
        try {
            for (int i = 0; i < array.length + 1; i++) {
                array[i] = in.nextInt();
            }
            for (int i : array) {
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    static void FileInput()  {
        try {
            FileInputStream fis = new FileInputStream("src/Java_Lecture/About_API/data.txt");
            System.out.println("파일 읽기 완료");
        } catch (FileNotFoundException e){
            System.out.println("해당 파일이 존재하지 않습니다.");
        }
    }

}
