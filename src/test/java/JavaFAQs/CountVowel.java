package JavaFAQs;

import com.google.common.base.CharMatcher;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Abhilash";
		int vowelCount = CharMatcher.anyOf("AEIOUaeiou").countIn(text);
		System.out.println(vowelCount);

	}

}
