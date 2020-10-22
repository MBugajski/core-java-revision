
public class Fish extends Animal implements Tasty{

	public Fish(int age, char sex, int weight) {
		super(age, sex, weight);
	}

	public void move() {
		System.out.println("Swimming...");
	}

}
