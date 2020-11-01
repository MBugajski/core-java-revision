package com.MBugajski.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {

		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("1. brave", "lacking fear");
		dictionary.put("2. joy", "lack of sadness");
		dictionary.put("3. brilliant", "with very limited amounts of stupidity");
		dictionary.put("4. tired", "low on energy");

		LinkedHashMap<String, String> dictionary2 = new LinkedHashMap<String, String>();
		dictionary2.put("1. brave", "lacking fear");
		dictionary2.put("2. joy", "lack of sadness");
		dictionary2.put("3. brilliant", "with very limited amounts of stupidity");
		dictionary2.put("4. tired", "low on energy");

		TreeMap<String, String> dictionary3 = new TreeMap<String, String>();
		dictionary3.put("brave", "lacking fear");
		dictionary3.put("joy", "lack of sadness");
		dictionary3.put("brilliant", "with very limited amounts of stupidity");
		dictionary3.put("tired", "low on energy");
		
		System.out.println("\nHashSet doesn't retain entry order:");
		for (String word : dictionary.keySet()) {
			System.out.println(word + ": " + dictionary.get(word));
		}

		
		System.out.println("\nLinkedHashMap does:");
		for (Map.Entry<String, String> entry : dictionary2.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("\nTree Map sorts entires by natural order:");
		for (Map.Entry<String, String> entry : dictionary3.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
