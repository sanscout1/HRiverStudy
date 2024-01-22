package JAVA.Java_Lecture.About_String;
import java.util.*;

public class VariableScope {

    static Scanner sc = new Scanner(System.in);
    static final double PI = 3.14;

    public static void main(String[] args) {
//        int t = 123;
//        System.out.printf("상품의 가격:%d원\n", t);
//        System.out.printf("상품의 가격:%6d원\n", t);
//        System.out.printf("상품의 가격:%-6d원\n", t);
//        System.out.printf("상품의 가격:%06d원", t);
//        int r = 10;
//        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",r,r*r*PI);
//        System.out.printf("%10d|%-10s|%10s", 1,"홍길동","도적");

//        System.out.println("a의 값 입력 : ");
//        int a = sc.nextInt();
//        // String temX = in.nextLine();
//        // int a = Integer.parseInt(tempX):
//        System.out.println("b의 값 입력 : ");
//        int b = sc.nextInt();
//
//        int result = a+b;
//        System.out.println("a+b = "+result);
//
//
//        boolean flag = true;
//
//        while(flag) {
//            String str = sc.nextLine();
//            System.out.println(str);
//            if (str.equals("q")) {
//                flag = false;
//            }
//
//        }

        System.out.println("학생의 이름을 입력하세요");
        String stu = sc.nextLine();
        ArrayList<String> subject = new ArrayList<String>();
        subject.add("국어");
        subject.add("영어");
        subject.add("수학");
        subject.add("과학");

        int[] grade = new int[subject.size()]; //국어 영어 수학 과학 순
        int total = 0;

        for(int i=0;i< subject.size();i++)
        {
            System.out.printf("학생의 %s 성적을 입력하세요",subject.get(i));
            grade[i]= sc.nextInt();
            total += grade[i];
        }

        for(int i=0;i< subject.size();i++)
        {
            System.out.printf("학생의 %s: %d \n",subject.get(i),grade[i]);
        }
        float avg =(float)total/subject.size();
        System.out.printf("학생의 총점은 %d, 평균은 %.1f 입니다",total,avg);

    }
}
