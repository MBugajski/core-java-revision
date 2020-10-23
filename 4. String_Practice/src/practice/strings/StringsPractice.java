package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
		String str = "ABCDEFGHIHGFEDCBA";

		System.out.println(str.length());
		System.out.println(str.substring(1));

		String extractedString = str.substring(1);
		System.out.println(extractedString);

		String restOfTheString = str.substring(0, 1);
		System.out.println(restOfTheString);

		System.out.println(extractedString.substring(1));

		String a = "A";
		
		//Need brackets of the part that follows won't print.
		System.out.println((a == restOfTheString) + " Don't do that for strings");
		System.out.println(a.equals(restOfTheString));
		System.out.println(a.equalsIgnoreCase("a"));
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.indexOf("DE"));
		System.out.println(str.indexOf("Z"));
		
		System.out.println(str.lastIndexOf("D"));
	}

}
