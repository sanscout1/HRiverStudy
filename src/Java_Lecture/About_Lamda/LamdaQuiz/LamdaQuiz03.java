package Java_Lecture.About_Lamda.LamdaQuiz;

@FunctionalInterface
 interface Operator {
    public int apply(int x, int y);
}

public class LamdaQuiz03 {
    private static int[] scores ={10,50,3};

    public static int maxOrMin(Operator operator){
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result,score);
        }
        return result;
    }

    public static void main(String[] args) {
        // 이렇게 하는게 더 깔끔해보인다.
        Operator maxOper = (x, y) -> Math.max(x, y);
        Operator minOper = (x, y) -> Math.min(x, y);
        int max2 = maxOrMin(maxOper);
        int min2 = maxOrMin(minOper);
        //
        int max = maxOrMin((x, y) -> Math.max(x, y));
        System.out.println("최대값: " + max);
        int min = maxOrMin(Math::min);
        System.out.println("최소값: "+ min);
    }
}
