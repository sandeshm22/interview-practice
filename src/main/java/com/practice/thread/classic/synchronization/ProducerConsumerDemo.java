package com.practice.thread.classic.synchronization;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> queue = new ArrayList<Integer>();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		Thread producerThread = new Thread(producer);
		Thread producerThread1 = new Thread(producer);
		Thread producerThread2 = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		producerThread1.start();
		producerThread2.start();
		//Thread.sleep(10);
		consumerThread.start();
		
	}

}
