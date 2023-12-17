package Java_assignments.HR_arrayAssignment2;

import java.util.Arrays;
import java.util.Scanner;

public class array9079_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] studentArray = new int[3][3];

        for(int i=0;i<3;i++){
            System.out.printf("%d번째 학생의 점수 ",i+1);
            for(int j=0;j<3;j++){
                studentArray[i][j]=sc.nextInt();
            }
        }
        int[] totalColumnStudentArray = new int[3];
        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){
                totalColumnStudentArray[i]+=studentArray[j][i];
            }
        }

        System.out.println("     국어 영어 수학 총점");
        System.out.printf(" 1번 %3d %3d %3d%4d\n",studentArray[0][0],studentArray[0][1],studentArray[0][2], Arrays.stream(studentArray[0]).sum());
        System.out.printf(" 2번 %3d %3d %3d%4d\n",studentArray[1][0],studentArray[1][1],studentArray[1][2], Arrays.stream(studentArray[1]).sum());
        System.out.printf(" 3번 %3d %3d %3d%4d\n",studentArray[2][0],studentArray[2][1],studentArray[2][2], Arrays.stream(studentArray[2]).sum());
        System.out.printf("합계%4d%4d%4d%4d",totalColumnStudentArray[0],totalColumnStudentArray[1],totalColumnStudentArray[2], Arrays.stream(totalColumnStudentArray).sum() );
    }
}
