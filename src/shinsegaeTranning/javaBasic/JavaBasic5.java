package shinsegaeTranning.javaBasic;

public class JavaBasic5 {
    public static void main(String[] args) {

        char tmpStar = '*';
        String outputStar = String.valueOf(tmpStar);

        for(int i=0; i<5; i++){
            System.out.println(outputStar);
            outputStar+=tmpStar;
        }
    }
}
