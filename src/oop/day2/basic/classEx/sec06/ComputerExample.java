package oop.day2.basic.classEx.sec06;

public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int result1 = computer.sum(1,2,3);
        int result2 = computer.sum(1,2,3,4,5);

        int[] values = {1,2,3,4,5,6,7,8,9,10};
        int result3 = computer.sum(values);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
