package beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewCalInt implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method m, Object[] par) throws Throwable {
		
System.out.println(" new claInt method by replace");
		return null;
	}

}
