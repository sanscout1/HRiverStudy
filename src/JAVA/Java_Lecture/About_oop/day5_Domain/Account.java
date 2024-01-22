package JAVA.Java_Lecture.About_oop.day5_Domain;

import java.util.Scanner;

public class Account {
    Scanner sc = new Scanner(System.in);
    private int balance = 0;

    private String accountNumber;

    private String name;

    private String password;

    Account(){}

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    Account(String accountNumber, String name, String password){
        this.accountNumber =accountNumber;
        this.name = name;
        this.password = password;
    }
    public void deposit(){
        System.out.println("입금 하실 금액 : ");
        this.balance += sc.nextInt();
        System.out.println("예금 잔액 : "+balance);
    }

}
