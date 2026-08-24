package myP;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stm {
	public static void main(String[] Args) {
		//System.out.println("Md Shahajada Imran");
		
		//Source Data
		List<String> list=Arrays.asList("md","Shahajada","Imran","New York","Queens");
	    /*for(String v:list) {
	    	System.out.println(v);
	    }*/
		
		//Stream Pipeline (Manipulation of data)
		long count=list.stream().count(); //count of the words (Strings)
		System.out.println("There are "+count+" words in the list");
		
		//Last word 
		String LastWord=list.stream().skip(list.size()-1).findFirst().toString(); 		
		
		
		//First Word
		String FirstWord=list.stream().findFirst().toString();
		System.out.println("First Word is "+FirstWord);
	
	}

}
