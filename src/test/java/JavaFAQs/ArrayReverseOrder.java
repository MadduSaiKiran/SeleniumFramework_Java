package JavaFAQs;

public class ArrayReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = { 1, 2, 4, 5, 6 };
		// before reverse
		for (int n : number) {
			// System.out.println(n);
		}
		// After reverse
		for (int i = number.length - 1; i >= 0; i--) {
			System.out.println(number[i]);
		}
	}
}
