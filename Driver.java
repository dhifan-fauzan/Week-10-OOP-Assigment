
public class Driver {

	public static void main(String args[]) {
		
		PoliceCar chevvy = new PoliceCar("Chevrolet", 50, 4, 4);
		PoliceCar[] policeCarList = {chevvy};
		
		System.out.println("Name: " + chevvy.getName());
		System.out.println("numOfWheels: " + chevvy.getNumWheels());
		System.out.println("Max Speed: " + chevvy.getMaxSpeed());
		System.out.println("Maximum Passengers: " + chevvy.getMaxPassengers());
		chevvy.escortingCriminal();
		chevvy.captureCriminal();
		chevvy.escortingCriminal();
	}
	
	
	
}
