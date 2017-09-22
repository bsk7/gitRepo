package beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext cap = new ClassPathXmlApplicationContext("spring.xml");
		
		Bank b = (Bank)cap.getBean("b");
		b.deposit();
		b.withdraw();
		b.calInt();
		
		
		
	}

}
