package com.abstractfactory.pattern;

public class Sphere implements GeometricShape {

	@Override
	public void draw() {
		System.out.println("Sphere is drawn");		
	}
}