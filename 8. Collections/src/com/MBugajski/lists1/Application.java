package com.MBugajski.lists1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("hollow");
		words.add("world");

		String item = words.get(1);
		System.out.println(item);

		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(22);
		numbers.add(99);
		numbers.add(65);
		numbers.add(71);

		int item2 = numbers.get(0);
		System.out.println("\nItem at possition 0 is: " + item2 +"\n");

		for (int number : numbers) {
			System.out.println(number);
		}

		// removes 1st item added (22 in this case) == .removeFirst()
		numbers.remove();

		item2 = numbers.get(0);
		System.out.println("\nItem at possition 0 is: " + item2 +"\n");

		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
