package com.chris.main;

public class Car extends Vechicle{

	boolean hasLeatherSeats;
	String engine;
	
	public Car() {
	}
	public Car(int numOfWheels, String colour, boolean hasLeatherSeats, String engine) {
		super(numOfWheels, colour);
		this.hasLeatherSeats = hasLeatherSeats;
		this.engine = engine;
	
	}
	public boolean isHasLeatherSeats() {
		return hasLeatherSeats;
	}
	public void setHasLeatherSeats(boolean hasLeatherSeats) {
		this.hasLeatherSeats = hasLeatherSeats;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [hasLeatherSeats=" + hasLeatherSeats + ", engine=" + engine + ", numOfWheels=" + numOfWheels
				+ ", colour=" + colour + "]";
	}
	
	
	
	
	
	
}
