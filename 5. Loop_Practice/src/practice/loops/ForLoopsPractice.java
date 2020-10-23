package practice.loops;

public class ForLoopsPractice {
	public static void main(String[] args) {

		String str = "adsdaearvcxvxzcgaraerasrAFEAR";
		for (int i = 0; i < str.length(); i++) {
			System.out.println("Character at: " + i + ": " + str.charAt(i));
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println("Character at: " + i + ": " + str.charAt(i));
		}

		//i+=2 == i = i + 2;
		for (int i = 0; i <= 100; i+=2) {
			System.out.println(i);

		}
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}
}
