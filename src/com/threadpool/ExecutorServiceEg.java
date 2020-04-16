package com.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEg {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			Runnable runnable = new WorkerThread("A" + i);
			executorService.execute(runnable);
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {

		}
		System.out.println("Finished all threads");
	}

}

class WorkerThread implements Runnable {

	String name;

	public WorkerThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - Started");
		businessLogic();
		System.out.println(Thread.currentThread().getName() + " - End");
	}

	public void businessLogic() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}