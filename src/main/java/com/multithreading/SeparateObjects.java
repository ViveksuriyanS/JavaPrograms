package com.multithreading;

public class SeparateObjects {
    public static void main(String[] args) {
        Runnable run1 = new MyRunnable();
        Runnable run2 = new MyRunnable();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
    }
}

// Both t1 and t2 will creates Separate Thread Stack
// In T1 Thread Stack -> One variable 'i' will be created
// Similarly in T2 Thread Stack -> One variable 'i' will be created
