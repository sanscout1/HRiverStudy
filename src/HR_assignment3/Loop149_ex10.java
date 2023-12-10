package HR_assignment3;

import java.util.Scanner;

public class Loop149_ex10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int repeatNumber = sc.nextInt();
        int initialNum = 1;
        for(int i =0;i<repeatNumber;i++){
            for(int j=0; j<repeatNumber;j++){
                System.out.printf("%d ",initialNum);
                initialNum+=2;
                if(initialNum>10){
                    initialNum=1;
                }

            }

            System.out.println();
        }
    }
}
