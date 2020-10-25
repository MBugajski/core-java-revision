package car_dealership;

public class Employee {

	String name;
	int employeeNumber;
	double bonus = 0;
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);
		}else if(vehicle.getPrice() <=customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		}
	}
	
	public void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Credit history checked.\n Customer has been approved for a loan");
	}
	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println(customer.getName() + " has purchased " + vehicle.getMake() + " " + vehicle.getModel() + " for $" + vehicle.getPrice());
		this.setBonus(this.getBonus() + vehicle.getPrice()/10);
		System.out.println(this.getName() + "'s total bonus this month is $" + this.getBonus() + ".");
		
	}
}
