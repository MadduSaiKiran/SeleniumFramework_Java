package JavaFAQs;

public class PrintMaxMinBetweenThree {

	public static void getMax(int a, int b, int c) {
		int max = 0;

		while (a > 0 || b > 0 || c > 0) {
			a--;
			b--;
			c--;
			max++;
		}
		System.out.println("the Maximum is " + max);
	}
	public static void getMin(int a, int b, int c) {
		int min = 0;

		while (a > 0 & b > 0 & c > 0) {
			a--;
			b--;
			c--;
			min++;
		}
		System.out.println("the Minimum is " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMax(10, 29, 30);
		getMin(10, 29, 30);
	}

}
