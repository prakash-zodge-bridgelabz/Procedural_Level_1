package com.bridgelabz;

public class BankAccount {
    static int balance;
    static int accountNumber;
    static void depositMoneyInAccount(int newAmount){
        balance += newAmount;
        System.out.println("Balance is : "+balance);
    }
    static void withdrawMoney(int newAmount){
        balance -= newAmount;
        System.out.println("Balance is : "+balance);
    }
    public static void main(String[] args) {
        balance=20000;
        accountNumber=12176;
        System.out.println("Total Balance : "+balance);
        depositMoneyInAccount(1000);
        withdrawMoney(5000);
    }
}
