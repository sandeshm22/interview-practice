package com.practice.scheduling.producer;

import java.util.List;

public class Consumer implements Runnable {

	private List<String> mutex = null;

	public Consumer(List<String> mutex) {
		this.mutex = mutex;
	}

	public void run() {

	}

	private void consume() {

	}

}
