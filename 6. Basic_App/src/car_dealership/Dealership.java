package car_dealership;

import java.util.ArrayList;
import java.util.List;

import jdk.vm.ci.code.site.Mark;

public class Dealership {

	double monthlySalary = 10000;
	static ArrayList<Employee> employeeData = new ArrayList<Employee>();

	public static void main(String[] args) {

		employ(Employee mark = new Employee("Eva"));
		employ(new Employee("Mark"));
		System.out.println(employeeData.get(0).getName());
		System.out.println(employeeData.get(0).getEmployeeNumber());
		System.out.println(employeeData.get(1).getName());
		System.out.println(employeeData.get(1).getEmployeeNumber());
		Customer customer1 = new Customer("Adam", 12000);
		Vehicle vehicle1 = new Vehicle("Mercedes", "C", 25000);
		
		
	}	

	public static void employ(Employee employee) {
		int employeeNumner = employeeData.size();
		employeeData.add(employee);
		employee.setEmployeeNumber(employeeNumner);
		
	}

	public void payEmnployees() {
		for (Employee employee : this.employeeData) {

		}
	}
}
