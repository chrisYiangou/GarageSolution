package com.chris.main;

public class MotorCycle extends Vechicle {

	public MotorCycle(int numOfWheels, String colour) {
		super(numOfWheels, colour);
	}
	
	public MotorCycle() {
		
	}

	@Override
	public String toString() {
		return "MotorCycle [numOfWheels=" + numOfWheels + ", colour=" + colour + "]";
	}

	
}
