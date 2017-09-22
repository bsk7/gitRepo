package org.bsk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Car {
	@Qualifier(value="e2")
	@Autowired
	private Engine engine;
	/*
	@Qualifier(value="e1")
	@Autowired
	private Engine engine1;
	*/
	public void details(){
		System.out.println("Car ModelYear"+engine.getModelYear());
		//System.out.println("Car ModelYear-1"+engine1.getModelYear());
	}
}
