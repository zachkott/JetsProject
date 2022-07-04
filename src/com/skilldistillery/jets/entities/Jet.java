package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {

	private String jetType;
	private String model;
	private double speed;
	private long price;
	private int range;
	
	public Jet() {}

	public Jet(String type, String model, double speed, long price, int range) {
		super();
		this.jetType = type;
		this.model = model;
		this.price = price;
		this.range = range;
		this.speed = speed;

	}

	public String getJetType() {
		return jetType;
	}

	public void setJetType(String jetType) {
		this.jetType = jetType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public void fly() {
		double airTime = range/speed;
		System.out.println(model + " is cleared for takeoff...");
		System.out.println(model + " had a succesful takeoff... ");
		System.out.println(model + " has reached its cruising altitude...");
		System.out.println(model + " will have to land in " + String.format("%.2f",airTime) + " hours.");
		System.out.println();
	}

	@Override
	public String toString() {
		return "[Type: " + jetType + ", Model: " + model + ", Speed: " + speed + " mph" + ", Price: $" + price + ", Range: "
				+ range + " mi" + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(jetType, model, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(jetType, other.jetType) && Objects.equals(model, other.model) && price == other.price
				&& range == other.range && Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	

	
}
