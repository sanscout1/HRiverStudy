package shinsegaeTranning.javaBasic;

public class JavaBasic3 {
    public static void main(String[] args) {

        int tmpRandomNum1 = 0;
        int tmpRandomNum2 = 0;

        while (true){
            tmpRandomNum1 = (int)((Math.random()*6)+1);
            tmpRandomNum2 = (int)((Math.random()*6)+1);

            System.out.printf("%d, %d\n",tmpRandomNum1,tmpRandomNum2);

            if(tmpRandomNum1+tmpRandomNum2==5){
                break;
            }

        }
    }
}
