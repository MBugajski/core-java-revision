package com.MBugajski.producerconsumer.threadpools;

public class MessageProcessor implements Runnable{
	
	private int message;

	public MessageProcessor(int message) {
	this.message = message;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "[RECIEVED] Message: " + message);
		respondToMessage();
		System.out.println(Thread.currentThread().getName() + "[DONE] Processint Message: " + message);
	}

	private void respondToMessage() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Unable to process message " + message);
		}
		
	}
}
