package JAVA.Java_Test.shinsegaeTranning.javaBasic;

public class JavaBasic4 {
    public static void main(String[] args) {

        for(int i =0; i<=15;i++){
            for(int j=0;j<=12;j++){
                if(4*i+5*j==60){
                    if(i<=10 && j<=10){
                        System.out.printf("%d, %d\n",i,j);
                    }
                }
            }
        }
    }
}
