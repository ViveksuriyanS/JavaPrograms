package com.multithreading;

public class DeamonThreadEg1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running");
            }
        });
        t1.setDaemon(true); // Without this the thread will not print anything, as the main thread life ends
        t1.start();

        try {
            // Join will make other threads to wait (even though the current thread is Demon Thread)
            // X.join(), X will be given priority in execution
            t1.join(); // Join will make sure that current thread is executed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
