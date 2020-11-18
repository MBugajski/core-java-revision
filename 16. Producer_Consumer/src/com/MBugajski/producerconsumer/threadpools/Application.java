package com.MBugajski.producerconsumer.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable processor1 = new MessageProcessor(2);
		executor.execute(processor1);
		
		Runnable processor2 = new MessageProcessor(3);
		executor.execute(processor2);
		
		Runnable processor3 = new MessageProcessor(4);
		executor.execute(processor3);
		
		Runnable processor4 = new MessageProcessor(5);
		executor.execute(processor4);
		
		Runnable processor5 = new MessageProcessor(6);
		executor.execute(processor5);
		
		executor.shutdown();
//		executor.shutdownNow();
		
		System.out.println("This is at the end of the app, but is exectuted immediately.");
		executor.awaitTermination(5, TimeUnit.SECONDS);
		System.out.println("awaitTermination will prevent this from being executed till it exectutes itself.");
		while (!executor.isTerminated()) {}
		System.out.println("Executor is terminated.");
	}

}
