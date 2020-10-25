package car_dealership;

public class Vehicle {
	String make;
	String model;
	double price;
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
