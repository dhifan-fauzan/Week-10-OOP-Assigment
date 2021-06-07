
public class Hovercraft extends GlobalVariables implements SeaVehicle, LandVehicle{
	
	public Hovercraft(String vehicleName,  int maxSpeed, int passengers) {
		
		super(vehicleName, maxSpeed, passengers);
		
	}
	
	public void enterSea() {
		
		System.out.println("Hovercraft Entering The Sea");
		
	}

	public void enterLand() {
		
		System.out.println("Hovercraft Entering Land");
		
	}
	
	
	
}
