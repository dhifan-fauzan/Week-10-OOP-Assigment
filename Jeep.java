
public class Jeep extends GlobalVariables implements LandVehicle{

	public Jeep(String name, int maxSpeed, int passengers, int wheels) {
		
		super(name, maxSpeed, passengers);
		this.setNumWheels(wheels);
	}
	
	public void soundHorn() {
		
		System.out.println("Honk Honk");
		
	}
}
