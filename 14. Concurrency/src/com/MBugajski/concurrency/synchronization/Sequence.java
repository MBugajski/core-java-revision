package com.MBugajski.concurrency.synchronization;

public class Sequence {

	private int value = 0;

	public synchronized int getNext() {
//		synchronized (this) {
			value++;
			return value;
//		}
	}
}
