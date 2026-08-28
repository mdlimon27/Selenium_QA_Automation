package com.example.demo;

public class myConcreteClass extends myAbstractClass {

	@Override
	public void doSomething() {
		System.out.println("doing something");
	}
	@Override
	public void calculate(int x) {
		System.out.println("Calculated value: "+2*x);
	}
}
