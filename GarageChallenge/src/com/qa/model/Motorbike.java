package com.qa.model;

public class Motorbike extends Vehicle {
	
	private String handlebarType;
	private boolean hasSaddleBag;
	private String frameMaterial;
	private double axleDiameter;
	
	public Motorbike(String vehicleMake, String bodyStyle, double fuelCapacity, double noOfWheels, double noOfPassengers,
			String handlebarType, boolean hasSaddleBag, String frameMaterial) {
		super(vehicleMake, bodyStyle, fuelCapacity, noOfWheels, noOfPassengers);
		this.handlebarType = handlebarType;
		this.hasSaddleBag = hasSaddleBag;
		this.frameMaterial = frameMaterial;
	}

	public String getHandlebarType() {
		return handlebarType;
	}



	public void setHandlebarType(String handlebarType) {
		this.handlebarType = handlebarType;
	}



	public boolean isHasSaddleBag() {
		return hasSaddleBag;
	}



	public void setHasSaddleBag(boolean hasSaddleBag) {
		this.hasSaddleBag = hasSaddleBag;
	}



	public String getFrameMaterial() {
		return frameMaterial;
	}



	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}



	public double getAxleDiameter() {
		return axleDiameter;
	}

	public void setAxleDiameter(double axleDiameter) {
		this.axleDiameter = axleDiameter;
	}

	// Base bill for repairing motorbike
	public void repairMotorbike() {
		double baseMotorbike = axleDiameter * 5;
	}

	@Override
	public String toString() {
		return "Motorbike [handlebarType=" + handlebarType + ", hasSaddleBag=" + hasSaddleBag + ", frameMaterial="
				+ frameMaterial + ", vehicleMake=" + vehicleMake + ", bodyStyle=" + bodyStyle + ", fuelCapacity="
				+ fuelCapacity + ", noOfWheels=" + noOfWheels + ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	
}
