
public class MyUtils {
	public static void printSomeJunk() {
		System.out.println("Some junk");
	}

	public static void printSomeJunkWithArgs(String junk) {
		System.out.println("Some junk: " + junk);

	}

	public static void printSomeJunkWithArgs(int junk) {
		System.out.println("Some junk: " + junk);
	}

	public static void addTwoNumbers(int x, int y) {
		System.out.println(x + y);
	}

	// Void methods can't return value
	public static int add10(int x) {
		return x + 10;
	}
	
	public int add5(int x) {
		return x + 5;
	}

	// There can't be two methods with the same name and arguments, even if they
	// return different things.
	public static String returnSomeJunkWithArgs(String junk) {
		return "Some junk: " + junk;
	}
}
