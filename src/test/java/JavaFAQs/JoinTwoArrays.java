package JavaFAQs;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;

public class JoinTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bowlers[]= {"Bumrah,Bhuvanesh,Siraj,Shardul,Chahar"};
		String batsmen[]= {"Virat,Kohli,Rahul,Shreyas,Surya,Rishab"};
		String fullTeam[]= ObjectArrays.concat(bowlers, batsmen,String.class);
		for(String ft:fullTeam) {
			System.out.println("Full Team is"+ft);	
		}
		
		
	Stream<String>bal=	Arrays.stream(bowlers);
	Stream<String>bat=	Arrays.stream(batsmen);
	 List<String> ft=   Stream.concat(bal, bat).collect(Collectors.toList());
	
		System.out.println(ft);
		
		Object fteam[]=ft.toArray();
		for(Object ft1:fteam) {
			System.out.println("Full Team is"+ft1);	
		}
		
	}

}
