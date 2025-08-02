package JavaFAQs;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class ArryasToCollection_ViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Arrays to Collection
		String names[]= {"Abhi","Sindhu"};
		for(String n:names) {
			System.out.println(n);	
		}
		
		List<String> namesList=Arrays.stream(names).collect(Collectors.toList());
		System.out.println(namesList);
		
		//Collection to Array
		
		List<Integer> number= Arrays.asList(1,3,5,2,4,6);
		System.out.println(number);
		Object[] num=   number.toArray();
		for(Object n:num) {
			System.out.println(n);
		}
		
		
	}

}
