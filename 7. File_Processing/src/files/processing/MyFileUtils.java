package files.processing;

import com.MBugajski.exceptions.FooRunetimeExpception;

public class MyFileUtils {

	public int subtract10FromLargerNumber(int number) throws FooRunetimeExpception {
		if (number < 10) {
			throw new FooRunetimeExpception("The number passed was smaller than 10.");
		}
		return number - 10;
	}

}
