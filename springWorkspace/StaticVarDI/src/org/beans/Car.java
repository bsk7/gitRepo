package org.beans;

public class Car {
	
	
	
	private static String name;
	

	private void setName(String name){
		Car.name=name;
	}
	
	public  void hello(){
		
		System.out.println("Hello   "+name);
	}
	
	
}
