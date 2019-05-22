package com.factory.pattern;

public class TestWheelFactory {

	public static void main(String[] args) {
		Wheel carWheel = WheelFactory.makeWheel(15,215);
		
		System.out.println("Diameter: "+carWheel.getDiameter());
		System.out.println("Width: "+carWheel.getWidth());
	}
}