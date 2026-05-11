package com.example.daalgavar_1;

public class Account{
    public static Account single_instance = null;
    public String s;
    private double balance;
    private Account() {
        s = "Hello I am a string part of Account class with Singleton design pattern";
    }
    public static Account getInstance(){
        if(single_instance == null) {
            single_instance = new Account();
        }
        return single_instance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Uldegdel hureltsehgui baina.");
        }
    }
}
