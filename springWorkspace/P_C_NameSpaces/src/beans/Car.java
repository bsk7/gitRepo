package beans;

public class Car {
	
	private String carName;
	private Engine engine;
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void getCarDetails(){
		System.out.println("carName = "+carName);
		System.out.println("engineModelYear = "+engine.getModelYear());
	}
	public Car(){
		System.out.println("Car constructor");
	}
}
