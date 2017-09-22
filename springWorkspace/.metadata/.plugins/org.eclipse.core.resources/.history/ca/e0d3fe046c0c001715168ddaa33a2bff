package org.driver;

import org.beans.car.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		
		Car c = (Car)ap.getBean(Car.class);
		c.getDetails();

	}

}
