
public abstract class Animal {
	int age;
	char sex;
	int weight;

	public Animal(int age, char sex, int weight) {
		super();
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

	public abstract void move();
}
