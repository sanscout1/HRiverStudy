package JAVA.Java_Lecture.About_String;

import java.util.*;


class StudentEx1 {
    String name;
    int kor;
    int eng;
    int math;

    char grade;

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return (this.kor + this.eng + this.math);
    }

    public float getAvg() {
        return ((this.kor + this.eng + this.math) / 3);
    }

    public void checkGrade() {
        if (getAvg() >= 80) {
            System.out.println("통과");
        } else {
            System.out.println("실패");
        }
    }

    public void setGrade() {
        if (getAvg() >= 90) {
            this.grade = 'A';
        } else if (getAvg() >= 80 && getAvg() < 90) {
            this.grade = 'B';
        } else if (getAvg() >= 70 && getAvg() < 80) {
            this.grade = 'C';
        } else {
            this.grade = 'F';
        }
    }

    public char getGrade() {
        return this.grade;
    }


}

public class CompareOperator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentEx1 stu = new StudentEx1();

        System.out.println("학생이름,국어, 영어, 수학 점수를 입력하세요");
        String name = sc.nextLine();
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        stu.setName(name);
        stu.setPoint(kor, eng, math);

        int total = stu.getTotal();
        float avg = stu.getAvg();

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + avg);
        stu.checkGrade();
        stu.setGrade();

        char grade = stu.getGrade();


        System.out.printf("%s 학생의 과목 평균은 %4.1f점 이고 학점은 %c 학점입니다", name, avg, grade);

    }
}
