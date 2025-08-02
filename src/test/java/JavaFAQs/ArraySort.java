package JavaFAQs;

import java.util.Arrays;


public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 1, 3, 4, 2 };
		int[] sortedNum = Arrays.stream(num).sorted().toArray();
		for (int n : sortedNum) {
			System.out.println(n);
		}

	}
}