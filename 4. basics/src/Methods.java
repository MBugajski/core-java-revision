
public class Methods {
	public static void main(String[] args) {

		System.out.println("Bla bla bla");
		printSomeJunk();
		printSomeJunkWithArgs("It's heloco+pter, not heli+copter.");
		printSomeJunkWithArgs(42);
		MyUtils.printSomeJunk();
		MyUtils.printSomeJunkWithArgs("It's heloco+pter, not heli+copter.");
		MyUtils.printSomeJunkWithArgs(42);
		MyUtils.addTwoNumbers(2, 5);
		MyUtils.add10(1);
		System.out.println(MyUtils.add10(1));
		MyUtils.returnSomeJunkWithArgs("50");
		System.out.println(MyUtils.returnSomeJunkWithArgs("49"));
	}

	public static void printSomeJunk() {
		System.out.println("Some junk");
	}

	public static void printSomeJunkWithArgs(String junk) {
		System.out.println("Some junk: " + junk);

	}

	public static void printSomeJunkWithArgs(int junk) {
		System.out.println("Some junk: " + junk);
	}

}
