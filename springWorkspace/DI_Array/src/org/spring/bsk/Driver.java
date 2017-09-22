package org.spring.bsk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		// Resource r =  new ClassPathResource("spring.xml");
		//BeanFactory ap = new XmlBeanFactory(r);
		Car car = (Car)ap.getBean("c");
		car.carData();
	}

}
