package com.MBugajski.lambdas.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700), new Car("Toyota", "Land Crusier", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200), new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000), new Car("Jeep", "Warngler", "Red", 24500));
		//Using methods
		printCarsPriceRange(cars, 20000, 40000);
		printCarByColour(cars, "Black");

		//Using anonymous classes
		printCarsOld(cars, new Condition<Car>() {

			@Override
			public boolean test(Car c) {
				return 20000 <= c.getPrice() && c.getPrice() <= 40000;
			}
		});

		printCarsOld(cars, new Condition<Car>() {

			@Override
			public boolean test(Car c) {
				return c.getColour().equals("Black");
			}
		});
		
		//Using lambdas
		printCars(cars, (c) -> 20000 <= c.getPrice() && c.getPrice() <= 40000);
		printCars(cars, (c) -> c.getColour().equals("Black"));
		
		
		Function<Car, String> priceAndColour = (c) -> " price = " + c.getPrice() + " colour = " + c.getColour();
		String stringCar = priceAndColour.apply(cars.get(0));
		System.out.println(stringCar);
	}

	public static void printCarsOld(List<Car> cars, Condition<Car> condition) {
		for (Car c : cars) {
			if (condition.test(c)) {
				c.printCar();
			}
		}
	}
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for (Car c : cars) {
			if (predicate.test(c)) {
				c.printCar();
			}
		}
	}

	public static void printCarsPriceRange(List<Car> cars, int low, int high) {
		for (Car car : cars) {
			if (low <= car.getPrice() && car.getPrice() <= high) {
				car.printCar();
			}
		}
	}

	public static void printCarByColour(List<Car> cars, String colour) {
		for (Car c : cars) {
			if (c.getColour().equals(colour)) {
				c.printCar();
			}
		}

	}
}
