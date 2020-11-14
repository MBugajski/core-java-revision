package com.MBugajski.concurrency.synchronization;

public class Worker extends Thread{

	Sequence sequence = null;
	
	public	Worker(String name, Sequence sequence) {
		this.setName(name);
		this.sequence = sequence;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + sequence.getNext());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
