package com.multithreading;

public class ExtendsThread extends Thread {
    public static void main(String[] args) {
        ExtendsThread t1 = new ExtendsThread();
        t1.start();
    }

    public void run() {
        System.out.println(Thread.currentThread() + " is running");
    }
}
