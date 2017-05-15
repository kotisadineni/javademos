package com.exceptions.InhertianceDemo;

public class Child extends Parent {
	
	
	
	public void  m1(){
		
	System.out.println("From Child");
		
	}

	
	public static void main(String[] args) {
	
		Parent p1 = new Child();
		p1.m1();
}
}