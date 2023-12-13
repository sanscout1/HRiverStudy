package shinsegaeTranning.javaBasic;

import java.util.Scanner;

class bank  {

    Scanner scan = new Scanner(System.in);
    private int balance;
    public void bankworkChoice(int choiceNum){
        switch (choiceNum) {
            case 1 -> setDepositBalance(scan.nextInt());
            case 2 ->withdrawBalance(scan.nextInt());
            case 3 ->getDepositBalance();
            case 4 ->exitBank();
        }
    }

    public void setDepositBalance(int balance){
        this.balance = balance;
    }

    public void withdrawBalance(int withdrawAmount){
        this.balance = this.balance-withdrawAmount;
    }

    public void getDepositBalance(){
        System.out.println(this.balance);
    }
    public void exitBank(){
        System.out.println("프로그램 종료");
        System.exit(0);
    }

}

public class JavaBasic8 {

    public static void main(String[] args) {
        Scanner scanChoice = new Scanner(System.in);

        bank myBank = new bank();
        int choiceNum;


        while(true){

            System.out.println("-----------------------------");
            System.out.printf("1.예금 | 2.출금 | 3.잔고 | 4.종료\n");
            System.out.println("-----------------------------");
            System.out.println("선택> ");
            choiceNum = scanChoice.nextInt();
            myBank.bankworkChoice(choiceNum);


        }
    }
}
