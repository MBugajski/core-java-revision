package com.MBugajski.producerconsumer;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> questions = null;
	final int LIMIT = 5;
	private int questionNumber;

	public Producer(List<Integer> questionList) {
		this.questions = questionList;
	}

	public void readQuestion(int questionNumber) throws InterruptedException {
		synchronized (questions) {
			while (questions.size() == LIMIT) {
				System.err.println("Questions have piled up... wait for answers.");
				questions.wait();
			}
		}
		synchronized (questions) {
			System.out.println("New question: " + questionNumber);
			questions.add(questionNumber);
			Thread.sleep(100);
			questions.notify();
		}
	}

	@Override
	public void run() {

		while (true) {
			try {
				readQuestion(questionNumber++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
