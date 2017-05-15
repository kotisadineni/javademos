package com.exceptions.InhertianceDemo;

public class Child extends Parent {
	
	public void m1(){
		
		Parent p1 = new Child();
		p1.m1();
		System.out.println("From Child");
		
	}

}
