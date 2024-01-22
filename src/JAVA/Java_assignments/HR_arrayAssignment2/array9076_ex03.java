package JAVA.Java_assignments.HR_arrayAssignment2;

public class array9076_ex03 {
    public static void main(String[] args) {
        int[] fibonacciArray=new int[100];
        fibonacciArray[1]=1;
        fibonacciArray[2]=1;

        for(int i=0;i<50;i++){
            fibonacciArray[i+3]=fibonacciArray[i+2]+fibonacciArray[i+1];
        }

        System.out.printf("피보나치 수열 10항 : %d\n",fibonacciArray[10]);
        System.out.printf("피보나치 수열 20항 : %d\n",fibonacciArray[20]);
        System.out.printf("피보나치 수열 30항 : %d\n",fibonacciArray[30]);
        System.out.printf("피보나치 수열 40항 : %d\n",fibonacciArray[40]);
    }
}
