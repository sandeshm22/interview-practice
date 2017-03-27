package com.practice.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class WaysToStartAThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		final Callable<String> callable = ()-> {
			return "sandesh";
		};
		FutureTask<String> task = new FutureTask<String>(callable);
		Thread thread = new Thread(task);
		
		thread.start();
		System.out.println(task.get());
		ExecutorService service = Executors.newFixedThreadPool(1);
		service.submit(task);
		service.submit(callable);
		service.submit(callable);
		service.submit(callable);
		service.submit(callable);
		service.submit(callable);
		service.submit(callable);
		service.submit(callable);
		service.submit(callable);
		service.submit(callable);
		service.submit(task);
		service.submit(task);
	}
}
