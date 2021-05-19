package com.multithreading;

public class DeamonThreadEg {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                // Keep on printing Running
                while(true) {
                    try {
                        Thread.sleep(1000); // Will print for every second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Running");
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.setDaemon(true); // If Deamon thread is not set, it will keep on printing
        t1.start();
        Thread.sleep(5000); // Main thread will sleep for 5 sec
    }
}
// The life of a Deamon thread is till the Main Thread is alive
//
