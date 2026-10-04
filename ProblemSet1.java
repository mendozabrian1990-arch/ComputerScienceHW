package edu.monmouth.problemSet1;

public class ProblemSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CampusVehicle vehicleOne = new CampusVehicle("1HGCR2F89HA000000", "Library", true);
		System.out.printf("VehicleOne id: %s, Location: %s, Availability: %b\n", 
				vehicleOne.getId(), vehicleOne.getLocation(), vehicleOne.isAvailable());
		
		CampusVehicle vehicleTwo = new CampusVehicle();
		System.out.printf("VehicleTwo id: %s, Location: %s, Availability: %b\n", 
				vehicleTwo.getId(), vehicleTwo.getLocation(), vehicleTwo.isAvailable());
		
		CampusVehicle vehicleThree =new CampusVehicle();
		System.out.printf("VehicleThree id: %s, Location: %s, Availability: %b\n", 
				vehicleThree.getId(), vehicleThree.getLocation(), vehicleThree.isAvailable());
		
		//Changing the values using set()
		System.out.println("\nUpdated Vehicle values:");
		
		vehicleOne.setId("4HGCR2F89HA000000");
		vehicleOne.setLocation("Parking Lot");
		vehicleOne.setAvailable(false);
		
		vehicleTwo.setId("5HGCR2F89HA000000");
		vehicleTwo.setLocation("Library");
		vehicleTwo.setAvailable(true);
		
		vehicleThree.setId("6HGCR2F89HA000000");
		vehicleThree.setLocation("Spruce Hall");
		vehicleThree.setAvailable(false);
		
		System.out.printf("VehicleOne id: %s, Location: %s, Availability: %b\n", 
				vehicleOne.getId(), vehicleOne.getLocation(), vehicleOne.isAvailable());
		System.out.printf("VehicleTwo id: %s, Location: %s, Availability: %b\n", 
				vehicleTwo.getId(), vehicleTwo.getLocation(), vehicleTwo.isAvailable());
		System.out.printf("VehicleThree id: %s, Location: %s, Availability: %b\n", 
				vehicleThree.getId(), vehicleThree.getLocation(), vehicleThree.isAvailable());
	}

}
