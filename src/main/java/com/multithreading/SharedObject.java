package com.multithreading;

public class SharedObject {
    public static void main(String[] args) throws InterruptedException {
        Runnable run = new MyRunnable();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.join();
        t2.join();
        t1.start();
        t2.start();

        System.out.println();
        Object objX = new Object();
        Runnable run1 = new MyRunnable(objX);
        Thread t3 = new Thread(run1);
        Thread t4 = new Thread(run1);
        t3.start();
        t4.start();
    }
}

// Similar to SeparateObjects.java,
// One Thread Stack will be created for both t1 and t2 Threads
// Since both thread are created based on same Runnable 'run'
// The object will be created on Heap and both thread will be pointed to 'run' Object
// Also both thread will access same variable 'Count', so both thread will modify the same variable


// Note
// Thread 1 and 2, create new object for each and will create own Object reference in Head
// From Thread 3 and 4 we are passing same object in both the threads, so it will share same memory in heap