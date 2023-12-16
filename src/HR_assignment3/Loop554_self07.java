package HR_assignment3;

import java.util.Scanner;

public class Loop554_self07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeatForNum=sc.nextInt();
        char repeatChar = 'A';
        int repeatNum = 1;
        for (int i = 0; i < repeatForNum; i++) {
            for (int k = i; k < repeatForNum; k++) {
                System.out.printf("%d ",repeatNum);
                repeatNum++;
            }
            for (int j = 3 - i; j < 4; j++) {
                System.out.printf("%s ", repeatChar);
                repeatChar++;
            }

            System.out.println();
        }
    }
}
