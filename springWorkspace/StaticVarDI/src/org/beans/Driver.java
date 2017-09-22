package org.beans;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		
ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");




		
		Car c = (Car)ap.getBean("c");
		c.hello();


	}

}
