package com.example.daalgavar_1;

public class Program {
    public static void main(String[] args) {
        Account acc1 = Account.getInstance();
        Account acc2 = Account.getInstance();
        if(acc1 == acc2) {
            System.out.println("Both have the same instance. Because of Singleton pattern.");
            System.out.println("Singleton value of Account class is:  " + acc1.s);
        }
        acc1.setBalance(500);
        acc1.deposit(200);
        acc2.withdraw(350);
        System.out.println("Balance of acc1: " + acc1.getBalance());
        System.out.println("Balance of acc2: " + acc2.getBalance());
    }
}
