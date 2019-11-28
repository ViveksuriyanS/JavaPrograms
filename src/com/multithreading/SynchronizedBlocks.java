package com.multithreading;

public class SynchronizedBlocks {

	public static void main(String[] args) {
		Thread T1 = new Thread(new ThreadX1());
		Thread T2 = new Thread(new ThreadX2());
		T1.setName("Book 1");
		T1.start();
		T2.setName("Book 2");
		T2.start();
	}

}

class ThreadX1 implements Runnable {
	@Override
	public void run() {
		SynchronizedBlock.commonPrinter(5);
	}

}

class ThreadX2 implements Runnable {

	@Override
	public void run() {
		SynchronizedBlock.commonPrinter(6);

	}

}

class SynchronizedBlock {
	public static void commonPrinter(int val) {
		// Acquiring lock on class
		synchronized (SynchronizedBlock.class) {
			for (int i = 1; i < val; i++) {
				System.out.println("Printing page " + i + " from book " + Thread.currentThread().getName());
			}
		}

		System.out.println("Printed...");
	}
}

// There is a print order mismatch if the commonPrinter is not synchronized
// When commonPrinter is synchronized, then the printing will be happen book wise