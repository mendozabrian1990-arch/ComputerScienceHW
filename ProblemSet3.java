package edu.monmouth.problemSet3;

import edu.monmouth.campusvehicle.CampusVehicle;
import edu.monmouth.campusvehicle.Color;

public class ProblemSet3 {

	public static void main(String[] args) {
		//Create a CampusVehicle object using the default constructor
		CampusVehicle vehicle = new CampusVehicle();
		//print all attributes for this object
		System.out.println("Vehicle values-");
		System.out.printf("Id:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", vehicle.getId(), vehicle.getLocation(), vehicle.isAvailable(), vehicle.getColor());
		
		//Using the four mutators, set this object’s attributes to valid values of your choice.
		vehicle.setId("mu12345");
		vehicle.setLocation("Library");
		vehicle.setAvailable(true);
		vehicle.setColor(Color.BLACK);
		//Retrieve and print all attributes for this object.
		System.out.printf("\nUpdated vehicle values-\nId:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", 
				vehicle.getId(), 
				vehicle.getLocation(), 
				vehicle.isAvailable(), 
				vehicle.getColor());
		
		/*Create another CampusVehicle object using the constructor that takes valid values for all
		attributes.*/
		CampusVehicle vehicle2 = new CampusVehicle("mu123456", "University Bluffs", false, Color.BLUE);
		//print all attributes for this object.
		System.out.printf("\nvehicle2 values-\nId:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", 
				vehicle2.getId(), 
				vehicle2.getLocation(), 
				vehicle2.isAvailable(), 
				vehicle2.getColor());
		//Using a mutator method, change this object’s color to a value of your choice.
		vehicle2.setColor(Color.GREEN);
		//Retrieve and print all attributes for this object.
		System.out.printf("\nUpdated vehicle2 values-\nId:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", 
				vehicle2.getId(), 
				vehicle2.getLocation(), 
				vehicle2.isAvailable(), 
				vehicle2.getColor());
		
		//Testing new id condition as well as new location condition
		CampusVehicle vehicle3 = new CampusVehicle("MU123", "LIBRARY", false, Color.BLUE);
		
		System.out.printf("\nvehicle3 values-\nId:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", 
				vehicle3.getId(), 
				vehicle3.getLocation(), 
				vehicle3.isAvailable(), 
				vehicle3.getColor());
		
		//Testing long id condition
		vehicle3.setId("MU12345678910111213415161718");
		System.out.printf("\nUpdated vehicle3 values-\nId:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", 
				vehicle3.getId(), 
				vehicle3.getLocation(), 
				vehicle3.isAvailable(), 
				vehicle3.getColor());
		
		//Testing Uppercase id gettin accepted and turning into lowercase 
		vehicle3.setId("MU99999");
		System.out.printf("\nUpdated vehicle3 values-\nId:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", 
				vehicle3.getId(), 
				vehicle3.getLocation(), 
				vehicle3.isAvailable(), 
				vehicle3.getColor());
		
		//Testing 3 aurgument consonstuctor adds the color aurgument
		CampusVehicle vehicle4 = new CampusVehicle("mu777777", "Spruce Hall", true);
		System.out.printf("\nvehicle4 values-\nId:%s\nLocation:%s\nAvailable:%b\nColor:%s\n", 
				vehicle4.getId(), 
				vehicle4.getLocation(), 
				vehicle4.isAvailable(), 
				vehicle4.getColor());


	}

}
