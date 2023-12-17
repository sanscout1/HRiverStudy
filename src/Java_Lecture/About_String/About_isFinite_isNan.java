package Java_Lecture.About_String;

public class About_isFinite_isNan {
    public static void main(String[] args) {

//        byte b4 = 125;
//        for (int i =0; i<5;i++){
//            b4++;
//            System.out.println(b4);
//        }

        int x=5;
        double y= 0.0;
        double z= x/y;

        if(Double.isFinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z);
        }
    }
}
