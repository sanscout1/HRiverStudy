package JAVA.Java_assignments.HR_assignment3;

public class Loop9057_ex03 {
    public static void main(String[] args) {
        String tmpStar = "*";
        String outputStar = tmpStar;

        for(int i =0; i<3;i++)
        {
            System.out.println(outputStar);
            outputStar+=tmpStar;

            if(i==2){
                for(int j=0;j<3;j++){
                    outputStar=outputStar.substring(0,outputStar.length()-1);
                    System.out.println(outputStar);
                }
            }
        }
    }
}
