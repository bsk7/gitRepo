package beans;


import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		
		Test t1 =(Test)ap.getBean("t");
		Test t2 =(Test)ap.getBean("t");
		
		Calendar c1 = (Calendar)ap.getBean("c");
		Calendar c2 = (Calendar)ap.getBean("c");
		
		System.out.println(t1==t2);
		System.out.println(c1==c2);

	}

}
