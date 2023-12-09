package HR_assignment2;

public class Loop9054_ex08 {
    public static void main(String[] args) {
        for (int i =1 ; i<10;i++){
            int tmpNum=2;
            for(int j=0;j<3;j++){
                System.out.printf("%d * %d = %2d   ",tmpNum,i,tmpNum*i);
                tmpNum++;
            }
            System.out.println();
        }
    }
}
