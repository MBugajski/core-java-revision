package com.MBugajski.snakes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		ArrayDeque<Snake> knotIsAGroupOfSnakesApparently = new ArrayDeque<>();
		Random aProperEnviorementForASnake = new Random();
		Predicate<Snake> whatIsANamingConventionForPredicatesAnyway = (s) -> s.snakeSexer();

		while (knotIsAGroupOfSnakesApparently.size() < 50) {
			knotIsAGroupOfSnakesApparently.offer(new Snake(aProperEnviorementForASnake.nextInt(50) + 1));
		}
		List<Snake> femaleSnakes = new ArrayList<Snake>();
		List<Snake> maleSnakes = new ArrayList<Snake>();

//		femaleSnakes = Snake.knotSorting(knotIsAGroupOfSnakesApparently, Snake.isFemale());
//		maleSnakes = Snake.knotSorting(knotIsAGroupOfSnakesApparently, Snake.isFemale().negate());

//		femaleSnakes =  knotIsAGroupOfSnakesApparently.stream().filter(s -> s.snakeSexer()).collect(Collectors.<Snake>toList());
//		maleSnakes =  knotIsAGroupOfSnakesApparently.stream().filter(s -> !s.snakeSexer()).collect(Collectors.<Snake>toList());

		knotIsAGroupOfSnakesApparently.forEach((snake) -> {
			if (whatIsANamingConventionForPredicatesAnyway.test(snake)) {
				femaleSnakes.add(snake);
			} else {
				maleSnakes.add(snake);
			}
		});
		System.out.println("A number of female snakes: " + femaleSnakes.size());
		System.out.println("A number of male snakes: " + maleSnakes.size());
	}
}
