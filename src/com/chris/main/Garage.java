package com.chris.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public List<Vechicle> storage = new ArrayList<Vechicle>();
	private List<Vechicle> fixed = new ArrayList<Vechicle>();

	public void bill() {

		int bill = 0;

		for (int i = 0; i < storage.size(); i++) {

			if (fixed.get(i) instanceof Car) {
				bill += 100;
			} else if (fixed.get(i) instanceof MotorCycle) {
				bill += 75;
			} else {
				bill += 50;
			}

		}
		System.out.println("Your bill is: " + bill);

	}

	// Add a vehicle to storage -- very simple way of appending to end of list
	public void addVehicle(Vechicle vehicle) {
		storage.add(vehicle);
	}

	// remove the vehicle
	public void removeVechicle(String name) {

		try {
			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getName().equals(name)) {
					storage.remove(i);
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Please enter a name. - Error:" + e);
		}
	}

	public void fixVehicle(String name) {

		try {
			for (int i = 0; i < storage.size(); i++) {
				if (storage.get(i).getName().equals(name)) {
					fixed.add(storage.get(i));
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Please enter a name. - Error:" + e);
		}
		
		bill();
	}

	public void emptyGarage() {
		storage.removeAll(storage);
	}

	public Garage(List<Vechicle> storage) {
		super();
		this.storage = storage;
	}

	public Garage() {

	}

	public List<Vechicle> getStorage() {
		return storage;
	}

	public void setStorage(List<Vechicle> storage) {
		this.storage = storage;
	}

}
