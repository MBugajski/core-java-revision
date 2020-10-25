package car_dealership;

public class Customer {

	String name;
	double cashOnHand;

	public Customer(String name, double cashOnHand) {
		super();
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		employee.handleCustomer(this, finance, vehicle);
	}
}
