package com.interview.practice;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(4);
		Thread player1 = new Thread(new Player(latch, 1));
		Thread player2 = new Thread(new Player(latch, 2));
		Thread player3 = new Thread(new Player(latch, 3));
		Thread player4 = new Thread(new Player(latch, 4));
		Thread player5 = new Thread(new Player(latch, 5));
		player1.start();
		player2.start();
		player3.start();
		player4.start();
		player5.start();
		latch.await();
		System.out.println("Hello All Players");
	}

}
