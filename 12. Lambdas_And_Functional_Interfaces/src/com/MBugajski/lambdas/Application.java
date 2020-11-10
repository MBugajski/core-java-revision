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
		// walker() accepts an interface Walkable that has a single method so it is
		// functional.
		// if we were to add another method lambda wouldn't work
		walker(() -> System.out.println("custom object walking"));

		// Assigning lambdas to a variable. type must be a functional interface
		ALambdaInterface aBlockOfCode = () -> System.out.println("custom object walking");

		// Can't pass aBlockOfCode since it's a wrong type (ALambdaInterface) than the
		// method requires
//		walker(aBlockOfCode);

		Walkable aBlockOfCode2 = () -> System.out.println("custom object walking");

		walker(aBlockOfCode2);

		ALambdaInterface helloVar = () -> System.out.println("Hello there!");

		Calculate sumVar = (a, b) -> a + b;

		helloVar.someMethod();
		System.out.println(sumVar.compute(1, 4));

		Calculate divideVar = (a, b) -> {
			if (a == 0) {
				return 0;
			}
			return a / b;
		};

		System.out.println(divideVar.compute(0, 5));
		System.out.println(divideVar.compute(20, 5));

		GenericFunctionalInterface<String> reverser = (s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result += s.charAt(i);
			}
			return result;
		};

		System.out.println(reverser.work("abecadlo"));
		
		GenericFunctionalInterface<Integer> factorial = (n) -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result = result * i;
			}
			return result;
		};
		System.out.println(factorial.work(5));
	}

	public void sayHello() {
		System.out.println("Hello there!");
	}

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	public int nonZeroDivide(int arg1, int arg2) {
		if (arg1 == 0) {
			return 0;
		}
		return arg1 / arg2;
	}

	public String reverse(String string) {
		String result = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			result = result + string.charAt(i);
		}
		return result;
	}

	public int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}

	public interface Write {
		public String writing(String string);
	}
	public interface Counter {
		public int count(int num);
	}

	public static void walker(Walkable walkable) {
		walkable.walk();
	}
}
