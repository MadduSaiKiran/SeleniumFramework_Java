package JavaFAQs;

public class CountCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCharCount("Welcome", 'e'));

	}

	public static long getCharCount(String str, char c) {
		return str.chars().filter(v -> (char) v == c).count();
	}

}
