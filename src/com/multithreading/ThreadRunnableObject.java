package com.multithreading;

public class ThreadRunnableObject {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

	}

}

// Instead of creating a class, we can directly define the run method inside the Runnable object
//		- It reduces the number of lines of code
//		- No need to create a one time executable class