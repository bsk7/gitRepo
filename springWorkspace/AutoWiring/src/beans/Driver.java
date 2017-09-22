package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(ap);
		System.out.println(ap.getBean("c"));
		Car c = (Car)ap.getBean("c");
		
		System.out.println(c);
		c.getDetails();
	}

}
