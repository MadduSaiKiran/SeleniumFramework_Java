package JavaFAQs;

import java.util.stream.IntStream;

public class Print1to100WithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.range(1, 100).forEach(e->System.out.println(e));

	}

}
