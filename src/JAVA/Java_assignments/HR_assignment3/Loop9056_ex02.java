package JAVA.Java_assignments.HR_assignment3;

public class Loop9056_ex02 {
    public static void main(String[] args) {
        String tmpStar="*";
        String outputStar=tmpStar;
        for(int i =0; i<3;i++){
            System.out.println(outputStar);
            outputStar+=tmpStar;
        }
    }
}
