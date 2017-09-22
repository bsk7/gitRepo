package beans;

public class Car {
	
	private Engine engine;
	public Car() {
		System.out.println("Car Constructor");
	}
	
	public void getDetails(){
		System.out.println("model Year"+engine.getModelYear());
	}

}
