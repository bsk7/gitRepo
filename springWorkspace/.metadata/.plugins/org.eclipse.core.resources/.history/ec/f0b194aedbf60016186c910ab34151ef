package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDriver {

	public static void main(String[] args) {
		
		//locate the xml file
				 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("spring.xml");
				 
				 Test ts =(Test)context.getBean("t");
				 ts.hello();

	

	}

}
