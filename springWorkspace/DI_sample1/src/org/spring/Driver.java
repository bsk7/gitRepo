package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("spring.xml");
		
		BeanFactory f = new XmlBeanFactory(r);
		Test t =(Test)f.getBean("t");
		t.hello("BSK");
		
		TestCons tc =(TestCons)f.getBean("tc");
		tc.hello();

	}

}
