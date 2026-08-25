package myP;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");
		
		//list of String values
		List<String> names=List.of("Md","Shahajada","Imran", "New York City","USA" ,"Barisal");
		names.forEach(v-> System.out.println(v)); //Printing each value of the names object
		
		//Getting the length/count of each word(String)'s letters(Characters) of the list "names".
		List<Integer> lengths=names.stream(). //Creating Stream pipeline
				map(v->v.length()). //Mapping/changing/converting words(String) to number(Integer) 
				collect(Collectors.toList()); //Collecting/returning/receiving/getting the mapped/converted Integer list into variable called "lengths". 
		
		lengths.forEach(v->System.out.println(v)); //Printing each value of the lengths object
		
		System.out.println("****************divider*************");
		//getting a new list where only greater than 5 numbers will be listed.
		List<Integer> lengths2=lengths.stream(). //Creating Stream Pipeline
				filter(v->v>5). //filtering/vetting/Screening list and only keep where number is greater than 5
				collect(Collectors.toList()); //Collecting/returning/receiving/getting the Filtered/Screened Integer list into variable called "lengths2".
	   lengths2.forEach(v->System.out.println(v)); //Printing each value of the lengths object
	   
	   
	}

}
