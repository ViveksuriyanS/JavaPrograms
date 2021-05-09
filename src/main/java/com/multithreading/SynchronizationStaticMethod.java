package com.multithreading;

public class SynchronizationStaticMethod {
// Class level locking
	public static void main(String[] args) {
		SynchronizeResource sync1 = new SynchronizeResource();
		Thread1 t1 = new Thread1(sync1);
		Thread2 t2 = new Thread2(sync1);

		SynchronizeResource sync2 = new SynchronizeResource();
		Thread3 t3 = new Thread3(sync2);
		Thread4 t4 = new Thread4(sync2);
		t1.setName("Book1");
		t2.setName("Book2");
		t3.setName("Book3");
		t4.setName("Book4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class SynchronizeResource {
	// synchronized void commonPrinter(int val)
	// -> Without static interference between t1-t2 with t3-t4
	// -> With Static t1 -> t2 -> t3 -> t4
	// The thread will finish its work then next thread will come into action
	synchronized static void commonPrinter(int val) {
		for (int i = 1; i < val; i++) {
			System.out.println("Page " + i + " is getting printed from book " + Thread.currentThread().getName());
		}

	}
}

class Thread1 extends Thread {
	private SynchronizeResource syncRes;

	Thread1(SynchronizeResource syncRes) {
		this.syncRes = syncRes;
	}

	public void run() {
		syncRes.commonPrinter(4);
	}
}

class Thread2 extends Thread {
	private SynchronizeResource syncRes;

	Thread2(SynchronizeResource syncRes) {
		this.syncRes = syncRes;
	}

	public void run() {
		syncRes.commonPrinter(5);
	}
}

class Thread3 extends Thread {
	private SynchronizeResource syncRes;

	Thread3(SynchronizeResource syncRes) {
		this.syncRes = syncRes;
	}

	public void run() {
		syncRes.commonPrinter(6);
	}
}

class Thread4 extends Thread {
	private SynchronizeResource syncRes;

	Thread4(SynchronizeResource syncRes) {
		this.syncRes = syncRes;
	}

	public void run() {
		syncRes.commonPrinter(7);
	}
}

// Suppose there are threads t1 and t2 with obj1 to invoke commonMethod()
// and threads t3 and t4 to invoke commonMethod()

// With Synchronized method or Synchronized blocks, 
//   - The interference between t1 and t2 will be controlled with obj1
//   - Similarly for t3 and t4 will be controlled with obj2
//   - Since all threads are accessing the same commonMethods() there will be interference between t1 and t3/t4 or t2 and t3/t4
// t1 will be printed first then t2
// t3 will be printed first then t4
// but t3 and t4 will come in between t2 and t4

// By Making the synchronized method static we can avoid the interference between threads
// But the thread order may differ