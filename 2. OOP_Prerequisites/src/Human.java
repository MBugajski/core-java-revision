
public class Human {
	String name;
	int age;
	int height;
	String eyeColor;

	public Human()	{
		
	}
	
	public Human(String name, int age, int heightInCentimeters, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.height = heightInCentimeters;
		this.eyeColor = eyeColor;
	}

	public void speak() {
		System.out.println("Hi, I'm " + name + ".");
		System.out.println("I'm " + height + " cm tall.");
		System.out.println("I'm " + age + " years old.");
		System.out.println("My eyes are " + eyeColor + ".");
	}

	public void eat() {
		System.out.println("eating...");
	}

	public void walk() {
		System.out.println("Walking...");

	}

}
