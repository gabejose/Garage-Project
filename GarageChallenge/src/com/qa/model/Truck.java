package com.qa.model;

public class Truck extends Vehicle {
	
	private boolean hasTrailer;
	private double weightCapacity;
	private String trailerCargo;
	
	public Truck(String vehicleMake, String bodyStyle, double fuelCapacity, double noOfWheels, double noOfPassengers,
			boolean hasTrailer, double weightCapacity, String trailerCargo) {
		super(vehicleMake, bodyStyle, fuelCapacity, noOfWheels, noOfPassengers);
		this.hasTrailer = hasTrailer;
		this.weightCapacity = weightCapacity;
		this.trailerCargo = trailerCargo;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

	public void setHasTrailer(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	public double getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(double weightCapacity) {
		this.weightCapacity = weightCapacity;
	}

	public String getTrailerCargo() {
		return trailerCargo;
	}

	public void setTrailerCargo(String trailerCargo) {
		this.trailerCargo = trailerCargo;
	}
	
	// Base bill for repairing a truck
	public void repairTruck() {
		double baseTruck = weightCapacity * 6;
	}

	@Override
	public String toString() {
		return "Truck [hasTrailer=" + hasTrailer + ", weightCapacity=" + weightCapacity + ", trailerCargo="
				+ trailerCargo + ", vehicleMake=" + vehicleMake + ", bodyStyle=" + bodyStyle + ", fuelCapacity="
				+ fuelCapacity + ", noOfWheels=" + noOfWheels + ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	
}
