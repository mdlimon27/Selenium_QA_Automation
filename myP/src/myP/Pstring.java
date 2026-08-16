package myP;

import java.util.stream.IntStream;

public class Pstring {
   public static void main(String... Args) {
	   String name="Md Shahajada Imran";
	   name=name.toUpperCase();
	   System.out.println(name);
	   
	  StringBuilder sb=new StringBuilder("Md Shahajada Imran");
	  
	  //Memory size optimization
	  System.out.println("Size before Trim: "+sb.capacity()); //Size 34 because Constructor with 1 string parameter is used which has 18 characters which require size 18. Default constructor comes with size 16. Therefore size is increased to 34 using formula (Old size * 2)+2 meaning (16*2)+2=34. 
	  sb.trimToSize(); //trim to size method will remove unused size. Used size is 18, therefore unused size 34-18=16 is deleted.
	  System.out.println("Size After Trim: "+sb.capacity()); //size after trim 
	 
	  
	  //Printing all characters of this string
	  for (int i=0;i<=sb.length()-1;i++) {
		  System.out.println(i+" "+sb.charAt(i));	  
	  }	  
	  
	  //IntStream sm=sb.chars();
	  //System.out.println(sm.count());
	  System.out.println("What is the string: "+sb.toString());	  
	  System.out.println("How long the string is: "+sb.length());
	  System.out.println("How many memory size is used by this: "+sb.capacity());
	  
	  // adding or appending or including another string "limon" to the right of this string.
	  sb.append(" limon");
	  System.out.println("What is the string now: "+sb.toString());
	  System.out.println("How long the string is: "+sb.length());
	  System.out.println("How many memory size is used by this: "+sb.capacity()); //18*2+2=38
	  
	  
	  //Update the letter l(lower case) of Limon string to L(Upper Case).
	  sb.replace(19, 20, "L");
	  System.out.println("What is the string now: "+sb.toString());
	  
	  //Delete or remove "Limon" from the string
	  sb.delete(18, 24);
	  System.out.println("What is the string now: "+sb.toString());
	  System.out.println("How long the string is: "+sb.length());
	  System.out.println("How many memory size is used by this: "+sb.capacity());
   }
}
