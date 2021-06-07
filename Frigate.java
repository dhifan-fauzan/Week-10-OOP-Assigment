
public class Frigate extends GlobalVariables implements SeaVehicle{
	
	Frigate(String name, int speed, int passengers, int displacement) {
		
		super(name, speed, passengers);
		this.setDisplacement(displacement);
	}

	public void fireGun() {
		
		System.out.println("Firing Frigate Gun");
	}
	
}
