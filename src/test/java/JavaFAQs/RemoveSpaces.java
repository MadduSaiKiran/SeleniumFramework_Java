package JavaFAQs;

public class RemoveSpaces {

	public static void main(String[] args) {

		String text = "Welcome to Java world";
		String textSpaceRemove = text.replaceAll(" ", "");
		System.out.println(textSpaceRemove);
	}

}
