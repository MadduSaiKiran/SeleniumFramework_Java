package JavaFAQs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHigh_Lowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(1, 3, 2, 5, 6, 8, 7);
		int secondLowest = number.stream().sorted().skip(1).findFirst().get();
		System.out.println("Second Lowest is " + secondLowest);

		int secondHighest = number.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Highest is " + secondHighest);

	}

}
