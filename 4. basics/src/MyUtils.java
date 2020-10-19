
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
	
	//Void methods can't return value
	
	public static int add10(int x) {
		return x + 10;
	}
	
	public static String returnSomeJunkWithArgs(String junk) {
		return "Some junk: " + junk;
	}
}
