package edu.monmouth.problemSet2;

import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object using default constructor
		CampusVehicle vehicle = new CampusVehicle();
		System.out.println("Vehicle values-");
		System.out.printf("Id:%s\nLocation:%s\nAvailable:%b\n", vehicle.getId(), vehicle.getLocation(), vehicle.isAvailable());
		
		//Setting attributes to my choices
		vehicle.setId("MU1393029");
		vehicle.setLocation("Library");
		vehicle.setAvailable(true);
		
		//Printing updated values
		System.out.printf("\nId:%s\nLocation:%s\nAvailable:%b\n", vehicle.getId(), vehicle.getLocation(), vehicle.isAvailable());
		
		//Checking vehicle out
		vehicle.checkOut();
		System.out.println("\n" + vehicle.isAvailable());
		
		//returning the vehicle
		vehicle.returnVehicle();
		System.out.println("\n" + vehicle.isAvailable());
		
		//Creating new object and printing all attributes
		CampusVehicle vehicle2 = new CampusVehicle("MU1393030", "University Bluffs", false);
		System.out.print("\nVehicle 2 values-");
		System.out.printf("\nId:%s\nLocation:%s\nAvailable:%b\n", vehicle2.getId(), vehicle2.getLocation(), vehicle2.isAvailable());
		
		//Using methods, I'm changing the attributes
		vehicle2.setId("MU1090");
		vehicle2.setLocation("library");
		vehicle2.setAvailable(true);
		
		//printing out all values of vehicle2
		System.out.printf("\nId:%s\nLocation:%s\nAvailable:%b\n", vehicle2.getId(), vehicle2.getLocation(), vehicle2.isAvailable());
		
		//making use of methods 
		vehicle2.checkOut();
		System.out.println("\n" + vehicle2.isAvailable());
		
		//returning the vehicle
		vehicle2.returnVehicle();
		System.out.println("\n" + vehicle2.isAvailable());
		
		//Creating object with invalid parameters
		CampusVehicle vehicle3 = new CampusVehicle("MU12345678910111213", "University Dining hall", false);
		System.out.println("\nVehicle 3 values-");
		
		//Printing to show attributes were protected
		System.out.printf("Id:%s\nLocation:%s\nAvailable:%b\n", vehicle3.getId(), vehicle3.getLocation(), vehicle3.isAvailable());
		
		//Nothing happened when user attempted to take out a vehicle that wasn't , available, it stayed false  
		vehicle3.checkOut();
		System.out.println("\n" + vehicle3.isAvailable());
		
		vehicle3.returnVehicle();
		System.out.println("\n" + vehicle3.isAvailable());
		
		//Another vehicle to test invalid parameters 
		CampusVehicle vehicle4 = new CampusVehicle("1393030", " ", true);
	
		//printing out all value to show invalid nets. 
		System.out.println("\nVehicle 4 values-");
		System.out.printf("Id:%s\nLocation:%s\nAvailable:%b\n", vehicle4.getId(), vehicle4.getLocation(), vehicle4.isAvailable());
		
		vehicle4.checkOut();
		System.out.println("\n" + vehicle4.isAvailable());
		
		vehicle4.returnVehicle();
		System.out.println("\n" + vehicle4.isAvailable());
		
		


		
	}

}
