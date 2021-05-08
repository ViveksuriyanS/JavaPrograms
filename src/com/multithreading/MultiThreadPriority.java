package com.multithreading;

public class MultiThreadPriority {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Therad 1 :" + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 2 :" + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});

		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());

		t1.setName("X Thread");
		t1.setPriority(8);
		t2.setName("Y Thread");
		t2.setPriority(10);

		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();

		// Get details of current thread
		t1.currentThread();

	}

}

// Range of priority goes from 1 to 10, where 1 being lowest and 10 being highest
// Priority number is not that readable, so priority can also be set with constants 
// MIN_PRIORITY - 1 and MAX_PRIORITY - 10 and NORM_PRIORITY -5
// 5 will be set for both t1 and t2 as average priority