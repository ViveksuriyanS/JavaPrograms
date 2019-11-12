package com.multithreading;

public class ThreadJoinAndAlive {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("a" + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("a" + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
		t1.start();

		t2.start();

		// Makes current thread to process over other threads, (throws exception : LINE
		// 5 )
		System.out.println(t1.isAlive());
		t1.join();
		System.out.println(t1.isAlive());
		t2.join();

		// We need to print BYE after t1 and t2 thread is done.
		System.out.println("BYE");
	}
}

// In this class we have 3 threads -> t1, t2 and main
// Before t1 and t2 is over, "BYE" gets printed.
// Since t1 and t2 is busy with their job with alternate Thread Suspend (SLEEP), main doesn't have anything to do, so it prints "BYE"

// JOIN is used to make other threads to wait till the current thread work is finished
// ALIVE is used to check whether the thread is alive or not, returns true or false
// Note: Thread.isAlive() will return false after join(), reason is after join the thread process gets over, so it will be dead.