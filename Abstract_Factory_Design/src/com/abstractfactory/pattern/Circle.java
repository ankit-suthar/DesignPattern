package com.abstractfactory.pattern;

public class Circle implements GeometricShape {

	@Override
	public void draw() 
	{
		System.out.println("Circle is drawn");		
	}
}