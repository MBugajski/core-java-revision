
public class Zoo {
	public static void main(String[] args) {

//		Animal animal1 = new Animal(5, 'F', 3);
//		animal1.eat();
//		animal1.move();

		// Bird bird1 = new Bird();
		Bird bird1 = new Bird(1, 'M', 2);
		bird1.move();
		bird1.eat();
		bird1.sleep();

		Mammal mammal1 = new Mammal(20, 'F', 15);
		mammal1.move();
		
		Sparrow bird2 = new Sparrow(2, 'M', 2);
		Chicken bird3 = new Chicken(4, 'M', 5);
		bird2.move();
		bird3.move();
		
		Fish fish1 = new Fish(1, 'M', 2);
		fish1.fry();
		bird3.fry();
		Cow mammal2 = new Cow(20, 'F', 500);
		mammal2.fry();
		
		movaAnimal(mammal1);
		movaAnimal(mammal2);
		
		
		Tasty chicken = new Chicken(4, 'F', 5);
//		chicken.move();
	}
	
	public static void movaAnimal(Animal animal) {
		animal.move();
	}
}
