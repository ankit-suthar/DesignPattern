package com.abstractfactory.pattern;

public class ThreeDShapeFactory extends AbstractFactory {

	@Override
	GeometricShape getShape(ShapeType name) {
		if(name==ShapeType.SPHERE)
			return new Sphere();
		else
			return null;
	}
}