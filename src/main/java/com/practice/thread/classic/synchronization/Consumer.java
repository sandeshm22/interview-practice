package com.practice.thread.classic.synchronization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Consumer implements Runnable {

	private List<Integer> queue;

	private static int MAX_SIZE = 5;

	public Consumer(List<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				consume();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void consume() throws InterruptedException, IOException {
		synchronized (queue) {
			if (queue.isEmpty()) {
				queue.wait();
			} else {
				int x = queue.remove(0);
				System.out.print(" " + x);
				File file = new File("D:\\op.txt");
				// FileOutputStream fos = new FileOutputStream(file);
				// fos.write(x);
				// fos.write((int) ' ');
				// fos.close();

				FileWriter fw = new FileWriter(file, true);
				if (x == 0) {
					fw.write("\n");
				}
				fw.write(x + " ");
				fw.close();
				queue.notifyAll();
			}
		}
	}

}
