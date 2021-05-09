package com.multithreading;

// Java code for thread creation by implementing 
// The Runnable Interface is a Functional Interface (like Lambda)
class MultithreadingDemo1 implements Runnable {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
class MultiThreadImplementsRunnable {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object1 = new Thread(new MultithreadingDemo1());
			object1.start();
		}
	}
}


// Runnable Interface doesn't have any start method like Thread extend
//   - Instead we create a thread object for the class and call start function : Line 23