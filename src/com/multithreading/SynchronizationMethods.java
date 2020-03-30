package com.multithreading;

public class SynchronizationMethods {
// Object Level Locking
	public static void main(String[] args) {
		SynchronizationMethod sync = new SynchronizationMethod();
		MyThread1 thread1 = new MyThread1(sync);
		MyThread2 thread2 = new MyThread2(sync);
		thread1.start();
		thread2.start();
	}

}

class SynchronizationMethod {

	// Synchronized Method
	// public void commonResource()
	synchronized void commonResource(int val) {
		for (int i = 1; i <= val; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i * val);
		}
	}

}

class MyThread1 extends Thread {
	SynchronizationMethod sync1;

	public MyThread1(SynchronizationMethod sync) {
		sync1 = sync;
	}

	public void run() {
		sync1.commonResource(5);
	}
}

class MyThread2 extends Thread {
	SynchronizationMethod sync2;

	public MyThread2(SynchronizationMethod sync) {
		sync2 = sync;
	}

	public void run() {
		sync2.commonResource(6);
	}
}

// When the commonResource is not defined as Synchronized the order of the output may be shuffled between thread1 and thread2
// By using Synchronization to the commonResource method, the thread execution follows order