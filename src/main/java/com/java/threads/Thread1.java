package com.java.threads;

public class Thread1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Dummy());
		t1.start(); // This will create a thread
		t1.run(); // This will run as a normal method call
	}
}

class Dummy implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is started ");
		System.out.println(Thread.currentThread().getName() + " is running now");
	}

}
