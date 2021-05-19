package com.multithreading;

public class WaitNotify {
    public static void main(String[] args) {
        Payment pay = new Payment();
        new Thread() {
            public void run() {
                pay.withDrawMoney(8000);
            }
        }.start();
        new Thread() {
            public void run() {
                pay.depositMoney(10000);
            }
        }.start();
    }
}

class Payment {
    double accountBalance = 5500d;

    synchronized public void withDrawMoney(double money) {
        if (accountBalance < money) {
            System.out.println("Not enough balance");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.accountBalance -= money;
        System.out.println("Withdraw Done.. Balance is " + this.accountBalance);
    }

    synchronized public void depositMoney(double money) {
        accountBalance = accountBalance + money;
        System.out.println("Amount deposited successfully...");
        System.out.println("Balance is " + accountBalance);
        notify();
    }
}