package com.qa.model;

public class Car extends Vehicle {
	
	private boolean hasAirBags;
	private double spoilerLength;
	private String engineLocation;
	
	public Car(String vehicleMake, String bodyStyle, double fuelCapacity, double noOfWheels, double noOfPassengers,
			boolean hasAirBags, double spoilerLength, String engineLocation) {
		super(vehicleMake, bodyStyle, fuelCapacity, noOfWheels, noOfPassengers);
		this.hasAirBags = hasAirBags;
		this.spoilerLength = spoilerLength;
		this.engineLocation = engineLocation;
	}

	public boolean isHasAirBags() {
		return hasAirBags;
	}

	public void setHasAirBags(boolean hasAirBags) {
		this.hasAirBags = hasAirBags;
	}

	public double getSpoilerLength() {
		return spoilerLength;
	}

	public void setSpoilerLength(double spoilerLength) {
		this.spoilerLength = spoilerLength;
	}

	public String getEngineLocation() {
		return engineLocation;
	}

	public void setEngineLocation(String engineLocation) {
		this.engineLocation = engineLocation;
	}
	
	// Base bill for repairing car
	public void repairCar() {
		double baseBill = spoilerLength * 3;
	}

	@Override
	public String toString() {
		return "Car [hasAirBags=" + hasAirBags + ", spoilerLength=" + spoilerLength + ", engineLocation="
				+ engineLocation + ", vehicleMake=" + vehicleMake + ", bodyStyle=" + bodyStyle + ", fuelCapacity="
				+ fuelCapacity + ", noOfWheels=" + noOfWheels + ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	
	
}
