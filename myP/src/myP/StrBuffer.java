package myP;

public class StrBuffer {
	public static void main(String[] Args) {
		System.out.println("md shahajada imran");
		
		StringBuffer sb=new StringBuffer();
		System.out.println("Memory Size of StringBuffer Object "+sb.capacity());
		
		//appending md shahajada imran into the object
		sb.append("Md Shahajada Imran");
		System.out.println(sb.toString());
		System.out.println("Memory size of the object after appending: "+sb.capacity());
		System.out.println("Used Memory is: "+sb.length());
		System.out.println("Un-Used/Empty memory size is: "+(sb.capacity()-sb.length()));
		
		//adding limon with the string literal 
		sb.append(" limon");
		System.out.println("Used Memory is: "+sb.length());
		System.out.println(sb.toString()); //printing after appending
		
		//Reverse the literal/texts
		sb.reverse();
		System.out.println(sb.toString()); //printing after reversing
		
		sb.reverse();
		System.out.println(sb.toString());
		
		//update a letter of the text (update a character in the literal)
		sb.replace(19, 20, "L"); // l to L
		System.out.println(sb.toString());
		
		//Delete limon from the text (delete a sub-string from the stringBuffer literal)
		sb.delete(18, 24);
		System.out.println(sb.toString());
		
		//Printing each letter of the text (printing each character of the stringBuffer literal)
		for (int i=0;i<=sb.length()-1;i++) {
			System.out.println(sb.charAt(i));
		}
		
		//printing each character of the stringBuffer: (Excludes spaces)
		for (int i=0;i<=sb.length()-1;i++) {			
			char c=sb.charAt(i);
			if(c==' ') {
				//don't print anything
			}else {
				//print the character
				System.out.println(c);
			}
		}
		
		
		int vHc=sb.hashCode();
		System.out.println("The Hash code of StringBuilder is: "+vHc);
		
		
	} 
	
	

}
