package com.MBugajski.concurrency.synchronization;

public class Application {

	public static void main(String[] args) {

		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker("A", sequence);
		worker1.start();
		
		Worker worker2 = new Worker("B", sequence);
		worker2.start();
	}

}

