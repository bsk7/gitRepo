package org.beans.car;

import javax.annotation.Resource;

import org.beans.engine.Engine;
import org.springframework.stereotype.Controller;
@Controller
public class Car {
	
	
	@Resource
	private Engine engine;
	
	public void getDetails(){
		System.out.println("Engine name"+engine.getEngineName());
	}

}
