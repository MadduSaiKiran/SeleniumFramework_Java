package JavaFAQs;

import java.util.Arrays;

public class AverageMaxMinOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = { 1, 2, 4, 5, 7 };
		// Finnd Average
		double average = Arrays.stream(number).average().getAsDouble();
		System.out.println("The average is " + average);

		// find the maximun
		int max = Arrays.stream(number).max().getAsInt();
		System.out.println("The Maximum is " + max);

		// find the Minum
		int min = Arrays.stream(number).min().getAsInt();
		System.out.println("The Minimum is " + min);

	}

}
