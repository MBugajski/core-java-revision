package com.Mbugajski.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Container<Integer, String> container = new Container<>(12, "Hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		System.out.println(container.getItem1());
		System.out.println(container.getItem2());
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("third");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet1.add("third");
		mySet1.add("forth");
		mySet1.add("fifth");
		
		Set<String> resultSet = union(mySet1, mySet2);
		//method reference
		resultSet.forEach(System.out::println);
		//stream with filter
		resultSet.stream()
			.filter(s->!s.isEmpty())
			.forEach(System.out::println);
		//lambda
		resultSet.forEach(s -> { 
			System.out.println(s);
			});
		//lambda with simplified syntax
		resultSet.forEach(s -> System.out.println(s));
		//Iterator with a simple while loop
		Iterator<String> iterator = resultSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}
}
