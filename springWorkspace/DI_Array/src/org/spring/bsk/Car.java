package org.spring.bsk;

public class Car {

	private String[] carNames;
	private Engine[] engines;
	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void carData(){
		
		for(String s:carNames)
		System.out.println(s);
		System.out.println("******************");
		for(Engine e:engines)
		System.out.println(e.getModelyear());
	}
}
