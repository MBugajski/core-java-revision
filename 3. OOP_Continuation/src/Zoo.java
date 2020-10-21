
public class Zoo {
	public static void main(String[] args) {

		Animal animal1 = new Animal(5, 'F', 3);
		animal1.eat();
		animal1.move();

		// Bird bird1 = new Bird();
		Bird bird1 = new Bird(1, 'M', 2);
		bird1.move();
		bird1.eat();
		bird1.sleep();

		Mammal mammal1 = new Mammal(20, 'F', 15);
		mammal1.move();
	}
}
