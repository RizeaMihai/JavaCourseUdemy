package com.company;

public class Main {

    public static void main(String[] args) {
        Account timsAccount = new Account("tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();

//        timsAccount.balance = 5000;    if it's not public, doesn't work

        System.out.println("Balance on account is " + timsAccount.getBalance());
//        timsAccount.transactions.add(6000);    if it's not public, doesn't work
        timsAccount.calculateBalance();
    }
}
