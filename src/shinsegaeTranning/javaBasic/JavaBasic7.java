package shinsegaeTranning.javaBasic;

public class JavaBasic7 {
    public static void main(String[] args) {
        char tmpAt = '@';
        String outputAt = String.valueOf(tmpAt);



        for(int i =0;i<3;i++){
            for(int j=1+i;j<3;j++){
                System.out.printf(" ");
            }

            System.out.printf("%s\n",outputAt);
            outputAt=outputAt+tmpAt+tmpAt;
        }

        outputAt=outputAt.substring(0,outputAt.length()-2);

        for(int i =2;i>0;i--){
            for(int j=i;j<3;j++){
                System.out.printf(" ");
            }
            outputAt=outputAt.substring(0,outputAt.length()-2);
            System.out.printf("%s\n",outputAt);

        }
    }
}
