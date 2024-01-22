package JAVA.Java_Lecture.About_Reference_address;


public class test3 {

    public static int asjkdkwajdn(int a, int b){
        System.out.println("나나나나나나나나나나나");
        return a+b;
    }

    public static String act(){

        return "난 함수야";
    }


    public static void main(String[] args) {

        int x= 15;
        int y=20;


        int a=10;
        int b=11;
        int c= asjkdkwajdn(a,b);
        int d = asjkdkwajdn(x,y);
        System.out.println(c);
        System.out.println(d);


        String abcd = act();
        System.out.println(abcd);
    }
}
