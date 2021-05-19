package com.multithreading;

public class StopThread {
    public static void main(String[] args) {
        StoppableRunnable stopObj = new StoppableRunnable();
        Thread t1 = new Thread(stopObj, "Thread A");
        t1.start();
        // Sleeping main thread for 5 sec
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // After 5 second it calls stopThread()
        System.out.println("Requesting Thread Stop");
        stopObj.stopThread();

    }
}

class StoppableRunnable implements  Runnable {
    private static boolean isStopRequested = false;
    @Override
    public void run() {
        System.out.println("Thread is running");
        while(!isStopRequested()) {
            // Sleeps Thread A for 1 sec
            try {
                Thread.sleep(1000);
                System.out.println("....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread is stopped");
    }

    public void stopThread() {
        this.isStopRequested = true;
    }

    public boolean isStopRequested() {
        return this.isStopRequested;
    }

}