package com.Mbugajski.generics;

public class Container<I, T> {
	I item1;
	T item2;
	
	public Container(I item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("Printing Contents of container: ");
		System.out.println("Item 1: " + item1);
		System.out.println("Item 2: " + item2);
	}

	public I getItem1() {
		return item1;
	}

	public void setItem1(I item1) {
		this.item1 = item1;
	}

	public T getItem2() {
		return item2;
	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}
}
