package myP;

import java.util.List;
import java.util.stream.Collectors;


public class Stream2 {
	public static void main(String[] Args) {
		//System.out.println("Md Shahajada Imran");
		
		List<String> list=List.of("Md","Shahajada","Imran","USA","Bangladesh","India");
		
		List<Integer> List2=list.stream().
				map(e ->e.length()).
				collect(Collectors.toList());
		System.out.println(List2);
		
	}

}
