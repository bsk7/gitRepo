package beans;


import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("spring.xml");
		
		while(true){
			Scanner s = new Scanner(System.in);
			System.out.println(" Enter 1 for save and 2 for clase");
			int i = s.nextInt();
			
			switch (i) {
			case 1:
				
				Test t = (Test)cap.getBean("t");
				System.out.println("Enter id");
				int id = s.nextInt();
				System.out.println("Enter name");
				String name = s.next();
				System.out.println("Enter add");
				String add = s.next();
				
				t.save(id, name, add);
				
				break;

			default:
				cap.close();
				break;
			}
		}
		
		
	}

}
