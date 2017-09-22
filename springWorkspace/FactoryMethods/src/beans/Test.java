package beans;

public class Test {
	
	private static Test t;
	
	private Test(){
		System.out.println("Test private constructor");
	}
	
	public static Test getInstance(){
		
		if(t==null){
			return new Test();
		}
		else{
			return t;
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
