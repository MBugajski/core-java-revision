
public class Earth {
	public static void main(String[] args) {
		Human adam = new Human();

		adam.name = "Adam";
		adam.age = 25;
		adam.height = 175;
		adam.eyeColor = "blue";

		adam.speak();
		adam.walk();

		Human eve = new Human("Eve", 25, 170, "green");

		eve.speak();
		eve.walk();
	}
}
