package com.example.enum1;

import java.util.EnumSet;

public class ClassWithMainMethod {

	public static void main(String[] Args) {
		
    days[] d=days.values(); //creating an array containing all singleton objects of enum days
    
    //printing all literals of singleton objects of d array
    for(days v : d) {
    	System.out.println(v);
    }		
    
	days today=days.FRIDAY;
	System.out.println(today);
		
	}
}
