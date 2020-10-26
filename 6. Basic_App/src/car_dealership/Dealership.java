package car_dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

	static double monthlySalary = 10000;
	static ArrayList<Employee> employeeData = new ArrayList<Employee>();

	public static void main(String[] args) {

		Employee eva = new Employee("Eva");
		Employee mark = new Employee("Mark");
		Customer customer1 = new Customer("Adam", 10000);
		Customer customer2 = new Customer("Liz", 22000);
		Customer customer3 = new Customer("Jake", 2000);
		Vehicle vehicle1 = new Vehicle("Mercedes", "C", 25000);
		Vehicle vehicle2 = new Vehicle("BMW", "Series 4", 15000);
		Vehicle vehicle3 = new Vehicle("Skoda", "Octavia", 5000);
		Vehicle vehicle4 = new Vehicle("Polonez", "Caro", 500);

		
		eva.handleCustomer(customer1, false, vehicle1);
		eva.handleCustomer(customer1, true, vehicle1);
		eva.handleCustomer(customer2, false, vehicle2);
		mark.handleCustomer(customer3, false, vehicle3);
		mark.handleCustomer(customer3, false, vehicle4);
		

		payEmployees();
	}

	public static void payEmployees() {
		for (Employee employee : Dealership.employeeData) {
			System.out.println(
					"Employee nr " + employee.getEmployeeNumber() + " " + employee.getName() + " has been paid $"
							+ (int) Dealership.monthlySalary + " salary and $" + (int) employee.getBonus() + " bonus.");
		}
	}
}
