package com.MBugajski.snakes;

import java.util.ArrayDeque;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Snake {
    private String snakiness;

    public Snake(int snakeSize) {
        super();
        this.snakiness = growASnake(snakeSize);
    }

    public boolean snakeSexer() {
        return snakiness.length() % 2 == 0;
    }

    public String growASnake(int snakeSize) {
        StringJoiner snakeGrower = new StringJoiner("");
        snakeGrower.setEmptyValue("");
        for (int i = 0; i < snakeSize; i++) {
            snakeGrower.add("a");
        }
        return snakeGrower.toString();
    }

    public String getSnakiness() {
        return snakiness;
    }

    public void setSnakiness(String snakeiness) {
        this.snakiness = snakeiness;
    }

    public static Predicate<Snake> isFemale() {
        return (s) -> s.snakeSexer();
    }

    public static Predicate<Snake> isMale() {
        return (s) -> !s.snakeSexer();
    }

    public static List<Snake> knotSorting(ArrayDeque<Snake> knot, Predicate<Snake> predicate) {
        return knot.stream().filter(predicate).collect(Collectors.<Snake>toList());
    }

}
