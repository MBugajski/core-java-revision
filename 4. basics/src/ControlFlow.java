
public class ControlFlow {

	public static void main(String[] args) {

		boolean hungry = true;

		if (hungry) {
			System.out.println("I'm starving.");
		} else {
			System.out.println("I'm not hungry");
		}

		int hungerRating = 5;
		if (!(hungerRating < 6)) {
			System.out.println("Not hungry.");
		} else {
			System.out.println("I'm starving...");
		}

		int favoriteTemp = 20;
		int currentTemp = 32;
		int margain = 5;
		String opinion;

		if (currentTemp < favoriteTemp - margain) {
			opinion = "It's pretty damn cold.";
		} else if (currentTemp > favoriteTemp + margain) {
			opinion = "it's too hot.";
		} else {
			opinion = "It's really nice today.";
		}

		System.out.println(opinion);

		int month = 3;

		switch (month) {
		case 1:
			System.out.println("January");
		case 2:
			System.out.println("February");
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("Unknown month");
		}
		
		month = 2;
		String monthString;

		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		default:
			monthString = "Unknown month";
			break;
		}
		System.out.println(monthString);

	}

}
