package com.multithreading;

public class ImplementsInterface implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " is running");
    }

    public static void main(String[] args) {
        ImplementsInterface t1 = new ImplementsInterface();
        Thread thread = new Thread(t1);
        thread.start();
    }
}
