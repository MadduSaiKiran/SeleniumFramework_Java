package JavaFAQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7);

		// Method 1
		Set<Integer> hs = new HashSet<Integer>(numbers);
		List<Integer> withOutDups1 = new ArrayList<Integer>(hs);
		System.out.println("O/p from method 1 "+withOutDups1);

		// Method 2

		List<Integer> withOutDups2 = numbers.stream().map(a -> a).distinct().collect(Collectors.toList());
		System.out.println("O/p from method 2 "+withOutDups2);
	}

}
