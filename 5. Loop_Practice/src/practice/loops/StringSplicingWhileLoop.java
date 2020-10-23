package practice.loops;

public class StringSplicingWhileLoop {

	public static void main(String[] args) {

		String str = "We have a large inventory of things in our werehouse falling in the category:apperal and the slightly more in demand category:makeup along with the category:furniture and ...";

		printCategories(str);
		printCategories2(str);
	}

	public static void printCategories(String str) {

		int categoryStart = 0;
		int categoryEnd = 0;

		while (true) {
			categoryStart = str.indexOf("category:");
			if (categoryStart == -1) {
				break;
			}
			str = str.substring(categoryStart + 9);
			categoryEnd = str.indexOf(" ");
			System.out.println(str.substring(0, categoryEnd));

		}
	}
	
	
	public static void printCategories2(String str) {
		int i = 0;
		while (true) {
			int found = str.indexOf("category:", i);
			if (found == -1) break;
			int start = found + 9;
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end+1;			
		}
	}
}
