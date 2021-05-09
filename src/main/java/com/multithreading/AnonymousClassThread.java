package com.multithreading;

public class AnonymousClassThread {

	public static void main(String[] args) {
		// Directly implementing run() method
		// This is anonymous thread
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Running thread1...");
				}
			}
		};

		// Funtional Interface can be accessed as below
		// Runnable Interface have only one method in it, so can be directly implemented using ->
		// method parameter () -> { // Implementation}
		// Parameterized method (x) -> { // Implementation}
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
