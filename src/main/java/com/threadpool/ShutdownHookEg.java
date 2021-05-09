package com.threadpool;

class MyThread extends Thread {
	public void run() {
		System.out.println("shut down hook task completed..");
	}
}

public class ShutdownHookEg {
	public static void main(String[] args) throws Exception {

		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());

		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
	}
}

// Before JVM shutdown, if you want to do something
// That code goes inside shutdownhook
// Exit can be Ctrl+c (Terminal), user Log off, shutdown, system.exit(0)