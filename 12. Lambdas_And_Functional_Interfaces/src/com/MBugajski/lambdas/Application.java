package com.MBugajski.lambdas;

public class Application {
	public static void main(String[] args) {
		Human tom = new Human();
		tom.walk();
		walker(tom);

		Robot wale = new Robot();
		wale.walk();
		walker(wale);

		// Anonymous class
		walker(new Walkable() {
			@Override
			public void walk() {
				System.out.println("Custom object walking...");
			}
		});
		
		// Lambda
		walker( () -> System.out.println("custom object walking"));

		// Assigning lambdas to a variable
		ALambdaInterface aBlockOfCode = () -> System.out.println("custom object walking");
		
	}

	public static void walker(Walkable walkable) {
		walkable.walk();
	}
}
