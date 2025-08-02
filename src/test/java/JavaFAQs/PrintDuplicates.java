package JavaFAQs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("John", "Virat", "Rohit", "Virat", "Rohit");
		Set<String> hs = new HashSet<String>();

		// Method1:

		for (String nm : names) {
			if (hs.add(nm) == false) {
				System.out.println("O/p from method1: " + nm);
			}
		}

		// Method2:

		List<String> dupNames = names.stream().filter(a -> hs.add(a) == false).collect(Collectors.toList());
		//System.out.println("O/p from method2: " + dupNames);
		names.stream().distinct().filter(a -> hs.add(a) == false).forEach(v->System.out.println("The dupName are"+v));
		//names.stream().filter(a -> hs.add(a) == false).forEach(v -> System.out.println(v));
	}

}
