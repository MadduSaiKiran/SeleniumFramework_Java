package JavaFAQs;

import java.util.Arrays;
import java.util.List;

public class Skip_Limit_SumOfFirst_LastFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int firstSum = number.stream().limit(3).reduce((a, b) -> a + b).get();
		System.out.println("first few elements sum is " + firstSum);

		int lastSum = number.stream().skip(8).reduce((a, b) -> a + b).get();
		System.out.println("Last few elements sum is " + lastSum);
	}

}
