package myP;

public class Pstring {
   public static void main(String... Args) {
	   String name="Md Shahajada Imran";
	   name=name.toUpperCase();
	   System.out.println(name);
	   
	  StringBuilder sb=new StringBuilder("Md Shahajada Imran");
	  
	  //Memory size optimization
	  System.out.println(sb.capacity()); //Size 34 because Constructor with 1 string parameter is used which has 18 characters which require size 18. Default constructor comes with size 16. Therefore size is increased to 34 using formula (Old size * 2)+2 meaning (16*2)+2=34. 
	  sb.trimToSize(); //trim to size method will remove unused size. Used size is 18, therefore unused size 34-18=16 is deleted.
	  System.out.println(sb.capacity()); //size after trim
	   
   }
}
