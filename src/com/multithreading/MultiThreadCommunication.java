package com.multithreading;

public class MultiThreadCommunication {

	public static void main(String[] args) {
		ThreadA obj = new ThreadA();
		new Producer(obj);
		new Consumer(obj);
	}

}

class Producer implements Runnable {

	// Creating object of class ThreadA
	ThreadA obj1;

	public Producer(ThreadA newObj1) {
		this.obj1 = newObj1;
		Thread t1 = new Thread(this, "Producer Thread");
		t1.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			obj1.put(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	ThreadA obj1;

	public Consumer(ThreadA newObj1) {
		this.obj1 = newObj1;
		Thread t1 = new Thread(this, "Consumer Thread");
		t1.start();
	}

	public void run() {
		while (true) {
			obj1.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class ThreadA {
	int num;
	boolean isValueSet = false;

	public void put(int num) {
		while (isValueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Put :" + num);
		this.num = num;
	}

	public void get() {
		System.out.println("Get :" + num);
	}
}