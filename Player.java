package com.interview.practice;

import java.util.concurrent.CountDownLatch;

public class Player implements Runnable {
	
	private CountDownLatch countDown;
	private int playerID;
	

	public Player(CountDownLatch countDown , int playerID) {
		super();
		this.countDown = countDown;
		this.playerID = playerID;
	}


	public void run() {
		System.out.println("Player :: " + playerID + "joined");
		this.countDown.countDown();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
