package com.MBugajski.lists2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Ford", "Focus", 500, false));
		vehicles.add(1, new Vehicle("Fiat", "126", 100, false));
		vehicles.add(new Vehicle("Porshe", "Carrera", 55500, false));
		vehicles.add(new Vehicle("Toyota", "Camery", 4000, true));

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
		LinkedList<Vehicle> vehicles2 = new LinkedList<>();
		vehicles2.add(new Vehicle("Ford", "Focus", 500, false));
		vehicles2.add(new Vehicle("Fiat", "126", 100, false));
		vehicles2.add(new Vehicle("Porshe", "Carrera", 55500, false));
		vehicles2.add(new Vehicle("Toyota", "Camery", 4000, true));

		printElements(vehicles);
		printElements(vehicles2);
	}

	public static void printElements(List someList) {
		for (int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}
}
