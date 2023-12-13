package shinsegaeTranning.javaBasic;

public class JavaBasic6 {
    public static void main(String[] args) {
        char tmpStar = '*';
        String outputStar = String.valueOf(tmpStar);

        for(int i=0; i<5; i++){
            System.out.printf("%5s\n",outputStar);
            outputStar+=tmpStar;
        }
    }
}
