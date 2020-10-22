
public class Cow extends Mammal implements Tasty{

	public Cow(int age, char sex, int weight) {
		super(age, sex, weight);
	}

	@Override
	public void fry() {
		System.out.println("Tasty bits of a " + this.getClass().getName().toLowerCase()  + " are being fried");
	}

	
}
