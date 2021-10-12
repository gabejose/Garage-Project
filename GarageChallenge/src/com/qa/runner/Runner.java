package com.qa.runner;

import com.qa.model.Car;
import com.qa.model.Garage;
import com.qa.model.Motorbike;
import com.qa.model.Truck;
import com.qa.model.Vehicle;

public class Runner {
	
	public static void main(String[] args) {
		
		// To test methods implemented
		Vehicle car1 = new Car("Chevrolet", "Sports", 17.5, 4, 4, true, 2.3, "Front");
		Vehicle motorbike1 = new Motorbike("Kawasaki", "Cruiser", 10.7, 2, 1, "Stock", false, "Aluminium");
		Vehicle truck1 = new Truck("Ford", "Pickup Truck", 18.2, 4, 5, true, 3000, "Rowing boats");
		
		Garage newGarage = new Garage();
		
		// Testing the addVehicle function
		newGarage.addVehicle(car1);
		newGarage.addVehicle(motorbike1);
		newGarage.addVehicle(truck1);
		
		// Testing the retrieveVehicle function
		newGarage.getVehicle(2);
		
		// Testing the repairVehicle function
		newGarage.repairVehicle(motorbike1);
		
		// Testing the emptyGarage function
		newGarage.emptyGarage();
	}
}
