import java.util.*;

public class FindNaturalNumbers {
	public static void main(String[] args) {
		int limit = 1000;
		int sum = 0;

		ArrayList<String> naturalNumbersUnderLimit = new ArrayList<String>();

		for(int count=1;count<limit;count++) {
			if ((count % 3 == 0 ) || (count % 5 == 0)) {
				naturalNumbersUnderLimit.add(String.valueOf(count));
			}
		}

		for(String counter: naturalNumbersUnderLimit) {
			sum += Integer.parseInt(counter);
		}

		System.out.println("Sum is " + sum);
	}
}