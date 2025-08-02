package JavaFAQs;

import java.util.Scanner;

public class ReverseString_Number {

	private static final char[] Integer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method

		// Reverse a String
		String text = "Abhilash";
		System.out.println("Before reverse " + text);
		StringBuffer sb = new StringBuffer(text);
		String reverseText = sb.reverse().toString();
		System.out.println("After reverse " + reverseText);

		// Reverse a numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		System.out.println("Before reverse " + number);
		StringBuffer sbn = new StringBuffer(String.valueOf(number));
		StringBuffer reverseNumber = sbn.reverse();
		System.out.println("After reverse " + reverseNumber);
	}

}
