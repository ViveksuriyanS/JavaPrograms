package com.multithreading;

public class ThreadSynchronization {

	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5000; i++) {
				c.increment();
			}

		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5000; i++) {
				c.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
	}
}

class Counter {
	int count;

	// Making the method synchronized
	// If a method is being accessed by multiple threads, then there will be a concurrency issue.
	public synchronized void increment() {
		count++;
	}
}

// It should print 10000, but printing lesser value

// t1 and t2 are running in parallel, incrementing the count value for each iteration

// By the time t1 is trying to increment the previous value, t2 is also trying to increment.

// Eg Previour value is 1000, t1 is trying to add 1 from previous value and t2 is also trying to add 1 from previous value
// Result should be 1002, but since both happend at same time actual value is 1001

// The t1 and t2 should not access count in parallel, one should wait for other
// NOTE: we use synchronized method to avoid the threads accessing the resource at the same time
// Only one thread can use the method at a time