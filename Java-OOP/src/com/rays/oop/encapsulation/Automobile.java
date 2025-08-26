package com.rays.oop.encapsulation;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 5;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		
		
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
	public void accelerator() {
		 speed = speed + 10;
		 System.out.println("Accelerated Current speed: " + speed);
	}
	
	public void brake() {
		speed = speed - 10;
		System.out.println("Braked. Current speed: " + speed);
	}
	
	public void changeGear(int gear) {
		if (gear > 0 && gear <= NO_OF_GEARS) {
			System.out.println("Gear changed to: " + gear);
		} else {
			System.out.println("Invalid gear. Please select gear between 1 and " + NO_OF_GEARS);
		}
	}
}
