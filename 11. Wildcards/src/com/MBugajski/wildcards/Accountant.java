package com.MBugajski.wildcards;

public class Accountant extends Employee {
	@Override
	public void work() {
		System.out.println("Accountant working...");
	}
	
	public void countShit() {
		System.out.println("Counting shit...");
	}
}
