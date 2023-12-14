package shinsegaeTranning.javaBasic;

public class JavaBasic7 {
    public static void main(String[] args) {

        int n = 2; // 행의 중간 위치
        for (int i = 0; i < 2*n+1; i++) {
            for (int j = 0; j < Math.abs(n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (n - Math.abs(n - i))*2 + 1; k++) {
                System.out.print("@");
            }
            System.out.println();
        }
//        char tmpAt = '@';
//        String outputAt = String.valueOf(tmpAt);
//
//
//
//        for(int i =0;i<3;i++){
//            for(int j=1+i;j<3;j++){
//                System.out.printf(" ");
//            }
//
//            System.out.printf("%s\n",outputAt);
//            outputAt=outputAt+tmpAt+tmpAt;
//        }
//
//        outputAt=outputAt.substring(0,outputAt.length()-2);
//
//        for(int i =2;i>0;i--){
//            for(int j=i;j<3;j++){
//                System.out.printf(" ");
//            }
//            outputAt=outputAt.substring(0,outputAt.length()-2);
//            System.out.printf("%s\n",outputAt);
//
//        }
    }
}
