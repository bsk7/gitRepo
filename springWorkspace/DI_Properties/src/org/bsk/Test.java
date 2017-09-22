package org.bsk;

import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	
	private Properties driver;
	
	
	
	
	
	public void setDriver(Properties driver) {
		this.driver = driver;
	}





	public void getDetails(){
		
		
		
		 Set keys= driver.keySet();
		for(Object key:keys){
			System.out.println(key+"   "+driver.getProperty(key.toString()));
		}
	}
	

}
