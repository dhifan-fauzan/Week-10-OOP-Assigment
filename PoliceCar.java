
public class PoliceCar extends GlobalVariables implements LandVehicle, IsEmergency{
	
	private boolean capturedCriminal = false;
	
	public PoliceCar(String vehicleName,  int maxSpeed, int passengers) {
		
		super(vehicleName, maxSpeed, passengers);
		
	}
	
	public PoliceCar(String vehicleName,  int maxSpeed, int passengers, int numWheels) {
		
		super(vehicleName, maxSpeed, passengers);
		this.setNumWheels(numWheels);
	}
	
	@Override
	public void soundSiren() {
		
		System.out.println("Police Siren Goes Wee-oww Wee-oww");
	}
	
	@Override
	public void drive() {
		
		System.out.println("Police Car Chasing Criminals");
	}
	
	public void escortingCriminal() {
		
		if(this.capturedCriminal) {
			System.out.println("Escorting Criminal to HQ");
			this.capturedCriminal = false;
		}
		else {
			System.out.println("No Criminal Captured");
		}
	}
	
	public void captureCriminal() {
		
		System.out.println("Capturing Criminal");
		this.capturedCriminal = true;
	}

}
