package org.bsk;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		// Resource r =  new ClassPathResource("spring.xml");
		//BeanFactory ap = new XmlBeanFactory(r);
		Test t = (Test)ap.getBean("t");
		t.getDetails();
	}

}
