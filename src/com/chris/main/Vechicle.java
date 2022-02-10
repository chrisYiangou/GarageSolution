package com.chris.main;

public class Vechicle {

	int id;
	String name;
	int numOfWheels;
	String colour;

	public Vechicle() {
	}

	public Vechicle(int numOfWheels, String colour) {
		this.numOfWheels = numOfWheels;
		this.colour = colour;
	}

	public void drive() {
		System.out.println("Vroom");
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getNumOfWheels() {
		return this.numOfWheels;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vechicle [numOfWheels=" + numOfWheels + ", colour=" + colour + "]";
	}

}
