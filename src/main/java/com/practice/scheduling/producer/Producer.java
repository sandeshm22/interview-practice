package com.practice.scheduling.producer;

import java.util.List;

public class Producer implements Runnable {

	private List<String> queue = null;

	private Object mutexLock;

	public Producer(final List<String> queue, final Object lock) {
		this.queue = queue;
		this.mutexLock = lock;
	}

	public void run() {
		try {
			if (queue.isEmpty()) {
				mutexLock.wait();
				produce();
			}
		} catch (Exception e) {

		} finally {

		}

	}

	private void produce() {
		this.queue.add("1");
	}

}
