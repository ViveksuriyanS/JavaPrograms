package com.threadpool;

public class ThreadGroupEg {

	public static void main(String[] args) {
		XThread x = new XThread();
		ThreadGroup tg = new ThreadGroup("Parent Thread Group");
		Thread t1 = new Thread(tg, x, "1");
		Thread t2 = new Thread(tg, x, "2");
		Thread t3 = new Thread(tg, x, "3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(tg.getName());
		tg.list();
	};

}

class XThread implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}

}