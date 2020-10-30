package com.MBugajski.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
	public static void main(String[] args) {
		HashSet<Integer> values = new HashSet<>();
		values.add(12);
		values.add(15);
		values.add(41);
		values.add(43);
		values.add(43);

		LinkedHashSet<Integer> linkedValues = new LinkedHashSet<>();
		linkedValues.add(12);
		linkedValues.add(15);
		linkedValues.add(41);
		linkedValues.add(43);
		linkedValues.add(43);

		for (Integer i : values) {
			System.out.println(i);
		}
		for (Integer i : linkedValues) {
			System.out.println(i);
		}

		HashSet<Animal> animals = new HashSet<Animal>();

		Animal animal1 = new Animal("Dog", 5);
		Animal animal2 = new Animal("Cat", 7);
		Animal animal3 = new Animal("Bird", 2);
		Animal animal4 = new Animal("Dog", 5);
		Animal animal5 = new Animal("Cow", 4);

		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);

		System.out.println(animal1.equals(animal4));

		System.out.println(animal1.hashCode());
		System.out.println(animal4.hashCode());

		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}
}
