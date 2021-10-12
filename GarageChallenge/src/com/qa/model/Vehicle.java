package com.qa.model;

public class Vehicle {
	
	// Attributes to be passed to sub classes
	public String vehicleMake;
	public String bodyStyle;
	public double fuelCapacity; // measured in gallons
	public double noOfWheels;
	public double noOfPassengers;
	
	public Vehicle(String vehicleMake, String bodyStyle, double fuelCapacity, double noOfWheels, double noOfPassengers) {
		super();
		this.vehicleMake = vehicleMake;
		this.bodyStyle = bodyStyle;
		this.fuelCapacity = fuelCapacity;
		this.noOfWheels = noOfWheels;
		this.noOfPassengers = noOfPassengers;
	}

	public String getVehicleMake() {
		return vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getBodyStyle() {
		return bodyStyle;
	}

	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(double noOfWheels) {
		if(noOfWheels % 2 == 1) {
			System.out.println("This vehicle is not roadworthy!");
		} else {
			this.noOfWheels = noOfWheels;
		}
	}

	public double getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(double noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	
	// Basic bill for repairing a vehicle based on fuel capacity
	public double repairVehicleFuel() {
		double fuelBill = fuelCapacity * 4;
		return fuelBill;
	}
	
	// Basic bill for repairing a vehicle based on no of wheels
	public double repairVehicleWheels() {
		double wheelsBill = noOfWheels * 21;
		return wheelsBill;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleMake=" + vehicleMake + ", bodyStyle=" + bodyStyle + ", fuelCapacity=" + fuelCapacity
				+ ", noOfWheels=" + noOfWheels + ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	
}
