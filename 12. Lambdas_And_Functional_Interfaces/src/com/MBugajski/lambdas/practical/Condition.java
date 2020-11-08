package com.MBugajski.lambdas.practical;

//basically a Predicate
@FunctionalInterface
public interface Condition<T> {
	public boolean test(T t);
}
