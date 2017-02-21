package org.spring;

import java.lang.reflect.Constructor;

public class PrivateConstructCall {

	public static void main(String[] args) throws Exception {
		
		

		Class c = Class.forName("org.spring.Test");
		
		Constructor con[]=c.getDeclaredConstructors();
		con[0].setAccessible(true);
		con[0].newInstance();

	}

}
