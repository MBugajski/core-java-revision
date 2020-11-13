package com.MBugajski.concurrency;

public class Application {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Starting Thread 1");
		Task taskRunner = new Task("A");
		taskRunner.start();

		Thread.sleep(100);

		System.out.println("Starting Thread 2");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(" number " + i + " - " + Thread.currentThread().getName());
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t2.start();

		Thread.sleep(100);

		System.out.println("Starting Thread 3");
		TaskInterface taskRunner3 = new TaskInterface("C");
		Thread t3 = new Thread(taskRunner3);
		t3.start();
		Thread.sleep(100);

		System.out.println("Starting Thread 4");
		Thread t4 = new Thread(new TaskInterface("D"));
		t4.start();

	}
}

class Task extends Thread {

	public Task(String name) {
		super();
		this.setName(name);
	}

	public void run() {
//		Thread.currentThread().setName(getName());
		for (int i = 0; i < 100; i++) {
			System.out.println(" number " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class TaskInterface implements Runnable {

	String name;

	public TaskInterface(String name) {
		super();
		this.name = name;
	}

	public void run() {
		Thread.currentThread().setName(name);
		for (int i = 0; i < 100; i++) {
			System.out.println(" number " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}