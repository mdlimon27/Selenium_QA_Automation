package myP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");
		 
		//Source Data
		List<Integer> list=Arrays.asList(5,7,1,10,24,72); //Source database (Source Collection in Heap)
		System.out.println("There are "+list.size()+" numbers in the Source list");
		
		
		//Stream/Manipulation Data
		Stream<Integer> s=list.stream(); //Manipulation database (Stream Object)		
		System.out.println("There are "+s.count()+" numbers in the Stream list"); 
		System.out.println("Numbers in Stream database/collection/list/array");
		s=list.stream(); //Re-Open Stream
		s.forEach(v->System.out.println(v));
		
		
		//Target Data
		s=list.stream(); //Re-Open Stream
	    Stream<Integer> td=s.map(n->n*2); //td variable points to target database (Double to source data in target)
	    s=list.stream(); //Re-Open Stream
	    System.out.println("There are "+s.count()+" numbers in the target list");
	    s=list.stream(); //Re-Open Stream
	    System.out.println("Numbers in target database/collection/list/array");
	    td.forEach(v->System.out.println(v));
		
	
		
		
		
	}

}
