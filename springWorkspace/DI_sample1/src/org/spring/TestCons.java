package org.spring;

public class TestCons {
	
	private String name ;
	private int age;
	public TestCons(String name){
		this.name = name;
	}
	public TestCons(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public void hello(){
		System.out.println("name  "+name);
		System.out.println("age   "+age);
	}

}
