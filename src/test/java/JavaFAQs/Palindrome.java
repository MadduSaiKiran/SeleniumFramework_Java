package JavaFAQs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String text1 = "Selenium";
		String text1 = "Radar";

		StringBuffer sb = new StringBuffer(text1);
		String reverseText1 = sb.reverse().toString();

		if (text1.equalsIgnoreCase(reverseText1)) {
			System.out.println("Number is Plindrome");
		} else {
			System.out.println("Number is not palindrome ");
		}
	}

}
