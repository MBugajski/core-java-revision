package com.MBugajski.producerconsumer.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	int questionNo;
	private BlockingQueue<Integer> questionQueue;

	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {

		while (true) {
			try {
				synchronized (this) {
					questionQueue.put(getNextQuestion());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private int getNextQuestion() {
		int nextQuestion = questionNo++;
		System.out.println("Got new question: " + nextQuestion);
		return nextQuestion;
	}
}
