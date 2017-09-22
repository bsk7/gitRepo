package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		

		String[] res = new String[]{"car.xml","engine.xml"};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(res);
		
		Car car = (Car)context.getBean("car");
		car.getCarDetails();

	}

}
