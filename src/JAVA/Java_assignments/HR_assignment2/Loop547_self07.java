package JAVA.Java_assignments.HR_assignment2;

public class Loop547_self07 {
    public static void main(String[] args) {
        int ansNum =2;
        for(int i=0; i<5;i++){

            int tmpNum =ansNum;
            for(int j=0;j<5;j++){

                System.out.printf("%d ",tmpNum);
                tmpNum++;
            }
            System.out.println();
            ansNum++;
        }
    }
}
