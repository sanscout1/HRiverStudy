package HR_assignment3;

public class Loop9062_ex07 {
    public static void main(String[] args) {

        char repeatChar = 'a';
        int repeatNum = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 3 - i; j < 4; j++) {
                System.out.printf("%s ", repeatChar);
                repeatChar++;
            }
            for (int k = i; k < 4; k++) {
                System.out.printf("%d ",repeatNum);
                repeatNum++;
            }
            System.out.println();
        }
    }
}
