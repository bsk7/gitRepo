package beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext cap = new ClassPathXmlApplicationContext("spring.xml");
		
		Car c = (Car)cap.getBean("c");
		
		System.out.println("-----------------CAR------------------------");
		System.out.println(c.getClass().getCanonicalName());
		System.out.println(c.getCarEngine().getName());
		
		Bus b = (Bus)cap.getBean("b");
		
		System.out.println("-----------------BUS------------------------");
		System.out.println(b.getClass().getCanonicalName());
		System.out.println(b.getBusEngine().getName());
		
		Truck t = (Truck)cap.getBean("t");
		
		System.out.println("-----------------TRUCK------------------------");
		System.out.println(t.getClass().getCanonicalName());
		System.out.println(t.getTruckEngine().getName());
		
		
	}

}
