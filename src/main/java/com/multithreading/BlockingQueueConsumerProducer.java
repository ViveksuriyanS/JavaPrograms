package com.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueConsumerProducer {
    private static BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {
        Thread T1 = new Thread(new Runnable() {
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread T2 = new Thread(() -> {
            try {
                Thread.sleep(100);
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        T1.start();
        T2.start();
    }

    private static void consumer() throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
            int out = bq.remove();
            System.out.println("Consumed " + out);
        }
    }

    private static void producer() throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
            Random rand = new Random();
            int i = rand.nextInt(100);
            System.out.println("Produced " + i);
            bq.put(i);
        }
    }
}
