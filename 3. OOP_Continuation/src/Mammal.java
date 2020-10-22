
public class Mammal extends Animal{
	
	public Mammal(int age, char sex, int weight) {
		super(age, sex, weight);
	}

	// I by now realized that mammals can also both swim and fly, same for birds,
	// but let's not dwell on that.
	public void move() {
		System.out.println("A " + this.getClass().getName().toLowerCase() + " is walking...");
	}
}
