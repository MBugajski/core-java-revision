package files.processing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text:");
		String enteredText = input.nextLine();
		System.out.println(enteredText);

		try {
			File file = new File("myfile.txt");
			Scanner input2 = new Scanner(file);
			while(input2.hasNextLine()) {
				String line = input2.nextLine();
				System.out.println(line);
			}
			input2.close();
		} catch (Exception e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		MyFileUtils myFileUtils = new MyFileUtils();
		try {
			myFileUtils.subtract10FromLargerNumber(9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
