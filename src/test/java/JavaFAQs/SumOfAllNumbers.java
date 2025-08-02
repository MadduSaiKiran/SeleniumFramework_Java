package JavaFAQs;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(1, 2, 3, 4);
		int sum = number.stream().reduce((a, b) -> a + b).get();
		System.out.println("The sum is " + sum);

	}

}
