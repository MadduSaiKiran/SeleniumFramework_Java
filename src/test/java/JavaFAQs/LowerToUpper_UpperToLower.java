package JavaFAQs;

public class LowerToUpper_UpperToLower {

	public static void main(String[] args) {
		String text = "Welcome";
		StringBuffer sb = new StringBuffer(text);

		for (int i = 0; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(text.charAt(i)));
			}

			if (Character.isUpperCase(text.charAt(i))) {
				sb.setCharAt(i, Character.toLowerCase(text.charAt(i)));
			}
		}
		System.out.println("The Output is " + sb);
	}

}
