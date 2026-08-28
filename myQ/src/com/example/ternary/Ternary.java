package com.example.ternary;

public class Ternary {
	public static void main(String[] Args) {
		System.out.println("Md Shahajada Imran");
		
		String name="Md Shahajada Imran";
		int output2;
		
		//Ternary Operation
		int output=name.length()>15 ? name.length() : 0;
		System.out.println(output);
		
		//Logical Statements
		if (name.length()>15) {
			 output2=name.length();
		}else {
			  output2=0;
		}
		System.out.println(output2);
	}

}
