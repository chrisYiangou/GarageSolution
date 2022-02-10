package com.chris.main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Vechicle vech = new Vechicle();
		Car bigCar = new Car();
		MotorCycle cycle = new MotorCycle();
		
		
		Garage garage = new Garage();
		
		
		garage.addVehicle(cycle);
		garage.addVehicle(bigCar);
		garage.addVehicle(vech);
		garage.addVehicle(cycle);
		
		garage.removeVechicle(null);
		
		
		
		
	}
}
