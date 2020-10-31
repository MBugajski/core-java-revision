package com.MBugajski.collectionMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Application {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(15);
		list1.add(15);
		list1.add(43);
		list1.add(52);
		list1.add(52);
	
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(15);
		list2.add(55);
		
		ArrayList<Integer> list3 = new ArrayList<>(list1);
		
		printElements(list1);
		list1.addAll(list2);
		printElements(list1);
		list1.removeAll(list2);
		printElements(list1);
		System.out.println(list1.contains(15));
		list1.clear();
		System.out.println(list1.isEmpty());
		list1.retainAll(list2);
		list3.addAll(list2);
		Collections.sort(list3);
		printElements(list3);
		
		ArrayList<Employee> list4 = new ArrayList<>();
		list4.add(new Employee("Adam", "Smith"));
		list4.add(new Employee("Eve", "Marx"));
		list4.add(new Employee("Anna", "Brown"));
		list4.add(new Employee("Adam", "Smith"));
		
		Collections.sort(list4);
		printElements(list4);
		
		
	}	
	
	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
		System.out.println("-------");
	}
}
