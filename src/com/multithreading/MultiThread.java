package com.multithreading;

public class MultiThread {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		b.start();
	}

}

class A extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("A");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("B");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


// OUTPUT
	
//	A
//	B
//	A
//	B
//	A
//	B
//	B
//	A
//	B
//	A



// Output is printing in fashion A then B, till 3rd iteration
// From fourth iteration B is printing before A
// The reason being - We are starting both threads at same time (.01 Millisecond difference), CPU is allowing both the thread to print A/B
// At some point both the thread are hitting the CPU at the same time
// We have something called scheduler, that process the thread 
// Based on different property scheduler will pick one of the thread

// In multiple thread request, the thread will be picked by scheduler based on the priority
// If the thread doesn't have any priority, then the scheduler will pick a thread randomly


// NOTE: ******** To avoid the thread collision, we can add sleep in between the thread, as commented in the code main method ******

// https://www.youtube.com/watch?v=Xj1uYKa8rIw&list=PLsyeobzWxl7rmuFYRpkqLanwoG4pQQ7oW