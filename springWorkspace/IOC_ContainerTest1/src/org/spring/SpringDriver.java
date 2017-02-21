package org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDriver {
	
public static void main(String[] args){
	
	Resource r = new ClassPathResource("spring.xml");
	
	BeanFactory f = new XmlBeanFactory(r);
	f.getBean("t");
	
	
}

}
