package com.practice.thread.classic.synchronization;

import java.util.List;

public class Producer implements Runnable {

	private List<Integer> queue;

	static int x = 0;

	private static int MAX_SIZE = 5;

	public Producer(List<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				produce();
			}
		} catch (Exception e) {
		}

	}

	private void produce() throws ArrayIndexOutOfBoundsException, InterruptedException {
		synchronized (queue) {
			if (queue.size() == MAX_SIZE) {
				queue.wait();
			} else {
				x = ++x % 2;
				queue.add(x);
				// System.out.println("produce " + ++x);
				queue.notify();
			}
		}
	}

}
