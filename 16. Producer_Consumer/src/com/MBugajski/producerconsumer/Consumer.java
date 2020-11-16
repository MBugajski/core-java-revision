package com.MBugajski.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> questions = null;

	public Consumer(List<Integer> questionList) {
		this.questions = questionList;
	}

	public void answerQuestion() throws InterruptedException {
		synchronized (questions) {
			while (questions.isEmpty()) {
				System.err.println("No questions to answer. Waiting for more.");
					questions.wait();
			}
		}
		synchronized (questions) {
			Thread.sleep(2500);
			System.out.println("Answering question: " + questions.remove(0) + ". " + questions.size() + " question(s) remaining.");
			questions.notify();
		}
	}

	@Override
	public void run() {
		
		while (true) {
			try {
				answerQuestion();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
