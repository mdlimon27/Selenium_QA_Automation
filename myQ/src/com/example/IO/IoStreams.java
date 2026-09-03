package com.example.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoStreams {
	public static void main(String[] Args) {
		/*System.out.println("Md Shahajada Imran");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int a=sc.nextInt();
		System.out.println("Please Enter another Number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Total Number is: "+c);*/
		
		//Reading Data From a Text File
		
		String[] aNames= {"Md","Shahajada","Imran","Java","QA"};
		
		
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\localadmin\\eclipse-workspace\\myQ\\src\\com\\example\\Imran.txt"));
			
			//writer.write("md shahajada Imran\n");
			//writer.write("QA Java");
			
			for(String v: aNames) {
				writer.write(v+"\n");
			}				
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\localadmin\\eclipse-workspace\\myQ\\src\\com\\example\\Imran.txt"));
		
			/*try {
				System.out.println(reader.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			String line;
			try {
				while((line=reader.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
