package shinsegaeTranning.javaBasic;

public class JavaBasic1 {
    public static void main(String[] args) {
        String grade = "B";
        int score1 =0;
        switch (grade) {
            case "A" -> score1 = 100;
            case "B" -> {
                int result = 100 - 20;
                score1 = result;
            }
            default -> score1 = 60;

        }
    }
}
