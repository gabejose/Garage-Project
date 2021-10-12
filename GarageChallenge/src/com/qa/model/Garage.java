package com.qa.model;

import java.util.ArrayList;

public class Garage {
	
	// ArrayList of Vehicles
	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	// Calculate bill for repairing vehicles
	public void repairVehicle(Vehicle fixVehicle) {
		String checkName = fixVehicle.getClass().getSimpleName().toString();
		if(checkName == "Car") {
			double fuelPrice = fixVehicle.repairVehicleFuel();
			double wheelsPrice = fixVehicle.repairVehicleWheels();
			// Method to repair car specific fields
			double total = fuelPrice + wheelsPrice;
			System.out.println("The total price for repairing your " + checkName + " is: " + total);
		} else if(checkName == "Motorbike") {
			double fuelPrice = fixVehicle.repairVehicleFuel();
			double wheelsPrice = fixVehicle.repairVehicleWheels();
			// Method to repair Motorbike specific fields
			double total = fuelPrice + wheelsPrice;
			System.out.println(total);
		} else if(checkName == "Truck") {
			double fuelPrice = fixVehicle.repairVehicleFuel();
			double wheelsPrice = fixVehicle.repairVehicleWheels();
			// Method to repair Truck specific fields
			double total = fuelPrice + wheelsPrice;
			System.out.println(total);
		}
		
	}
	
	// Add a vehicle
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		System.out.println(vehicleList);
	}
	
	// Remove a vehicle
	public void removeVehicle(Vehicle disposeVehicle) {
		vehicleList.remove(disposeVehicle);
	}
	
	// Retrieve a vehicle
	public void getVehicle(int index) {
		System.out.println(vehicleList.get(index));
	}
	
	// Empty the garage
	public void emptyGarage() {
		vehicleList.clear();
		boolean emptyGarage = vehicleList.isEmpty();
		if(emptyGarage == true) {
			System.out.println("The garage is empty. Call it a day!");
		}
	}
}
