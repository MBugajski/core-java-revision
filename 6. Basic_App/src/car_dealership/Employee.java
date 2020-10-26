package car_dealership;

public class Employee {

	String name;
	int employeeNumber;
	double bonus = 0;
	public Employee(String name) {
		super();
		this.employeeNumber = Dealership.employeeData.size();
		Dealership.employeeData.add(this);
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
			runCreditHistory(customer, loanAmount, vehicle);
		}else if(vehicle.getPrice() <=customer.getCashOnHand()) {
			processTransaction(customer, vehicle);
		}else {
			System.out.println("Customer " + customer.getName() + " wasn't able to afford " + vehicle.getMake() + " " + vehicle.getModel() + ".\n");
		}
	}
	
	public void runCreditHistory(Customer customer, double loanAmount, Vehicle vehicle) {
		System.out.println("Credit history checked.\nCustomer " + customer.getName() + " has been approved for a loan of $"+ (int)loanAmount + ".");
		processTransaction(customer, vehicle);
		
	}
	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println(customer.getName() + " has purchased " + vehicle.getMake() + " " + vehicle.getModel() + " for $" + (int)vehicle.getPrice());
		this.setBonus(this.getBonus() + vehicle.getPrice()/10);
		System.out.println(this.getName() + "'s total bonus this month is now $" + (int)this.getBonus() + ".\n");
		
	}
}
