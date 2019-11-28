package com.multithreading;

public class AnonymousClassThread {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Running thread1...");
				}

			}
		};

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Running thread2...");
			}

		});

		t1.start();
		t2.start();
	}

}

// Without extending Thread or Implementing Runnable Interface
// Directly creating a thread and running it
