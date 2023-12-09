package control;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b || a>c){
            System.out.printf("1");
        } else {
            System.out.printf("0");
        }

        if(a==b && b==c){
            System.out.printf("1");
        } else{
            System.out.printf("0");
        }


    }
}
