package Java_Lecture.About_Collection.ListExample.StudendEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StudentDao {
    List<StudentVO> studentList = new ArrayList<StudentVO>();
    Scanner in = new Scanner(System.in);
    public void getStudent(){
        this.studentList.add(new StudentVO("01","jay1"));
        this.studentList.add(new StudentVO("02","jay2"));
        this.studentList.add(new StudentVO("03","jay3"));
        System.out.println("학생 입력완료");
    }
    public void studentExamInsert(){
        System.out.println("=============성적 입력================");
        for (StudentVO studentVO : studentList) {
            System.out.println("학번 : "+studentVO.getStuno());
//            System.out.println("국어 성적을 입력");
//            studentVO.setKor(in.nextInt());
//            System.out.println("영어 성적을 입력");
//            studentVO.setEng(in.nextInt());
//            System.out.println("수학 성적을 입력");
//            studentVO.setMath(in.nextInt());

            int[] tmpArray = new int[3];
            System.out.println("국어 성적을 입력");
            tmpArray[0]=in.nextInt();
            System.out.println("영어 성적을 입력");
            tmpArray[1]=in.nextInt();
            System.out.println("수학 성적을 입력");
            tmpArray[2]=in.nextInt();
            studentVO.setScore(tmpArray);
        }
    }
    public void studentRecordPrint(){
        System.out.println("=============학생총점평균================");
        for (StudentVO studentVO : studentList) {

            int total = Arrays.stream(studentVO.getScore()).sum();
            System.out.println("학번 : "+studentVO.getStuno()+" 이름 : "+studentVO.getName()+" 총점 : "+ total + " 평균 : "+ total/3);
        }
    }

    public void studentUpdate(){
        System.out.println("수정할 학생의 학번을 입력하세요");
        String stuno = in.nextLine();
        int [] tmpArray = new int[3];
        for (StudentVO studentVO : studentList) {
            if(stuno.equals(studentVO.getStuno())){
//                System.out.println("국어 성적을 입력");
//                studentVO.setKor(in.nextInt());
//                System.out.println("영어 성적을 입력");
//                studentVO.setEng(in.nextInt());
//                System.out.println("수학 성적을 입력");
//                studentVO.setMath(in.nextInt());

                System.out.println("국어 성적을 입력");
                tmpArray[0]=in.nextInt();
                System.out.println("영어 성적을 입력");
                tmpArray[1]=in.nextInt();
                System.out.println("수학 성적을 입력");
                tmpArray[2]=in.nextInt();
                studentVO.setScore(tmpArray);
            }
        }

    }

    public void studentPrintAll(){
        System.out.println("===========학생정보출력===========");
        for (StudentVO studentVO : studentList) {
//            System.out.println("학번 : "+studentVO.getStuno()+" 이름 : "+studentVO.getName()+" 국어 : "+ studentVO.getKor()+" 영어 : "+studentVO.getEng()+" 수학 : "+ studentVO.getMath());
            System.out.println("학번 : "+studentVO.getStuno()+" 이름 : "+studentVO.getName());
            int[] tmp = new int[3];
            tmp = studentVO.getScore();
            System.out.println(" 국어 : "+ tmp[0]+" 영어 : "+tmp[1]+" 수학 : "+ tmp[2]);
        }
    }

    public void studentPickPrint(){
        System.out.println("출력할 학생의 학번을 입력하세요");
        String stuno = in.nextLine();
        for (StudentVO studentVO : studentList) {
            if(stuno.equals(studentVO.getStuno())){
//                System.out.println("학번 : "+studentVO.getStuno()+" 이름 : "+studentVO.getName()+" 국어 : "+ studentVO.getKor()+" 영어 : "+studentVO.getEng()+" 수학 : "+ studentVO.getMath());
                int[] tmp = new int[3];
                tmp = studentVO.getScore();
                System.out.println(" 국어 : "+ tmp[0]+" 영어 : "+tmp[1]+" 수학 : "+ tmp[2]);
            }
        }
    }
}
