package com.exmaple;

public class OperationPromotionEx {
    public static void main(String[] args) {
        byte result1 = 10+30;
        System.out.println(result1); //컴파일 단계 연산 수행


        byte v1 = 10;
        byte v2= 20;
        int result2 =v1+v2;
        System.out.println(result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long  v6 = v3+v4+v5;

        System.out.println(v6);

        char v7 ='A';
        char v8 = 1;
        byte v9 = 'B';
        //char v10 = v9;

        System.out.println(v7 + v8);
        System.out.println((char)(v7 + v8));

    }
}
