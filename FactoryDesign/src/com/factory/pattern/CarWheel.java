package com.factory.pattern;

public class CarWheel implements Wheel {
	protected float diameter;
	protected float width;
	
	public CarWheel(float diameter,float width)
	{
		this.diameter=diameter;
		this.width=width;
	}

	public float getDiameter() {
		return diameter;
	}

	public float getWidth() {
		return width;
	}	
}