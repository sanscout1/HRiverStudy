package JAVA.Java_Lecture.About_Reference_address;

public class ForUsingDiff {

    public static void main(String[] args) {
        int[] intArray = null;

        double[] doubleArray = null;

        String[] strArray = null;


        intArray = new int[] {1,2,3,4};  // new int[4];   주소값 할당

        for(int i =0 ; i<intArray.length; i++){
            intArray[i] = 10*(i+5);
            //intArray[i] += 40;
        }
        for(int i : intArray) {
            System.out.println(i);
        }

        ////

        doubleArray = new double[4];  // new double[4];

        for(int i = 0 ; i<doubleArray.length; i++){
            doubleArray[i] = 10.0+i;
            System.out.println(doubleArray[i]);
        }

        for(double i : doubleArray) {
            System.out.println(i);
        }


        strArray = new String[4];



        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0] = "+ season[0]);
        System.out.println("season[0] = "+ season[1]);
        System.out.println("season[0] = "+ season[2]);
        System.out.println("season[0] = "+ season[3]);

        for (String s : season) {
            System.out.println(s);
            System.out.println("사계절 중 " + s);
        }

        season[1] = "여름";
        String result = printSeason(season);

        System.out.println(result);


    }
    public static String printSeason(String[] season) {
        for (String s : season) {
            System.out.println(s);
            //System.out.println("사계절 중 " + s);
        }
        return "출력완료";
    }
}
