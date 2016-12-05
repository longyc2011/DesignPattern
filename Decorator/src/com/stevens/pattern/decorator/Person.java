package com.stevens.pattern.decorator;

public class Person {
	
	public Person() {}
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
		
	public void Show(){
		System.out.println(" decorated " + name);
	}

}
