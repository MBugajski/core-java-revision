
public class Chicken extends Bird implements Tasty{

	public Chicken(int age, char sex, int weight) {
		super(age, sex, weight);
	}
	
	public void move() {
		System.out.println("Walking...");
	}

}
