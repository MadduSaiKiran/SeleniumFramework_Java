package JavaFAQs;

import java.util.Arrays;
import java.util.Iterator;

public class SplitWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textTrim = "WelcometoJavas  ";
		String text = "WelcometoJava";
		System.out.println(textTrim);
		String[] splitText = text.split(" ");
		String trimText = text.trim();
		System.out.println(trimText);

		for (String st : splitText) {
			//System.out.println(st);
		}

	}

}
