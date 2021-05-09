package com.multithreading;

public class DeadLockThreads {

	public static void main(String[] args) {
		final String s1 = "T1";
		final String s2 = "T2";

		Thread t1 = new Thread(() -> {
			synchronized (s1) {
				System.out.println(s1 + " is running " + Thread.currentThread().getName());
				synchronized (s2) {
					System.out.println(s2 + " is running " + Thread.currentThread().getName());
				}
			}

		});

		Thread t2 = new Thread(() -> {

			synchronized (s2) {
				System.out.println(s2 + " is running " + Thread.currentThread().getName());
				synchronized (s1) {
					System.out.println(s1 + " is running " + Thread.currentThread().getName());
				}
			}

		});
		t1.start();
		t2.start();
	}

}
