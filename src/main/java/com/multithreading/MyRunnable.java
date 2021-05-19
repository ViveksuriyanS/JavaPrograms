package com.multithreading;

public class MyRunnable implements Runnable {
    private int count = 0;
    Object obj1 = null;

    MyRunnable() {
        super();
    }

    MyRunnable(Object obj) {
        this.obj1 = obj;
    }

    @Override
    public void run() {
        Object obj;
        if(obj1 == null) {
            obj = new Object();
        } else {
            obj = obj1;
        }
        for (int i = 0; i < 1000; i++) {
            this.count++;
        }
        System.out.println(this.count + " from Thread" + Thread.currentThread().getName());
        System.out.println(obj + " from Thread" + Thread.currentThread().getName());
    }
}
