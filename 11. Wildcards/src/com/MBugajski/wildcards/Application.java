package com.MBugajski.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;

		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;

		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Accountant> accountants = new ArrayList<>();
		// polymorphism doesn't work with generics
//		employees = accountants;

		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		employees2 = accountants2;

		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		employees3 = accountants3;

		// Works with interfaces as well
		ArrayList<? extends Worker> employees4 = new ArrayList<>();
		ArrayList<Accountant> accountants4 = new ArrayList<>();
		employees4 = accountants4;

		ArrayList<? super Employee> employees5 = new ArrayList<>();
		ArrayList<Accountant> accountants5 = new ArrayList<>();
		// Accountant is below Employee in the hierarchy of classes
//		employees5 = accountants5;

		employees.add(new Employee());
		accountants.add(new Accountant());

		makeEmployeeWork(employees);
//		makeEmployeeWork(accountants);
		
		makeEmployeeWork2(accountants);
		makeEmployeeWork2(employees);
	}

	public static void makeEmployeeWork(List<Employee> employees) {
		for (Employee employee : employees) {
			employee.work();
		}
	}

	public static void makeEmployeeWork2(List<? extends Employee> employees) {
		for (Employee employee : employees) {
			employee.work();
		}
	}
	public static void makeEmployeeWork3(List<? extends Employee> employees) {
		for (Employee employee : employees) {
//			Can't call methods that aren't in the upper bound class (Employee in this case)
//			employee.countShit();
		}
	}
	public static void makeEmployeeWork4(List<? extends Employee> employees) {
//			Can't switch to the child class either since <? extend Employee> means all the child classes, not just 1.
//		for (Accountant employee : employees) {
//			employee.countShit();
//		}
	}
	public static void makeEmployeeWork5(List<? extends Employee> employees) {
//			You'd need to downcast to access it this way. Not type safe. Don't.
		for (Accountant employee : (ArrayList<Accountant>) employees) {
			employee.countShit();
		}
	}

}

