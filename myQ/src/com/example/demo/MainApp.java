package com.example.demo;

public class MainApp {

	public static void main(String[] args) {
		
		myConcreteClass obj=new myConcreteClass();
		obj.calculate(5);
		obj.doSomething();
		obj.show();
		int a=obj.hashCode();
		System.out.println(a);
		String b=obj.toString();
		System.out.println(b);
		

	}

}
