package com.multithreading;

public class ThreadLambda {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println(e);
				}
			}

		});
		t.start();
	}
}

// By using Lambda function in Java 1.8, the number of lines of code is reduced.
// ->  is used to create a new object, new key identifier is removed

// And also we are replacing the Runnable object creation, instead we directly place the code inside the thread object instantiation.

// Functionalities used in this class 
// 	- anonymous class
//	- Lambda expression