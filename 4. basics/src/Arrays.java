
public class Arrays {
	public static void main(String[] args) {
		
		int[] values = new int[100];
		values[0] = 1000;
		values[99] = 900;
		
		System.out.println(values[1]);
		System.out.println(values.toString());
		
		String[] words = new String[3];
		words[0] = "He";
		words[1] = "is";
		words[2] = "there";
		
		System.out.println(words[0]);
		
		words = new String[3];
		
		System.out.println(words[1]);
	}
}
