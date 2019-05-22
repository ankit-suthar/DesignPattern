package com.abstractfactory.pattern;

public class TwoDShapeFactory extends AbstractFactory {

	@Override
	GeometricShape getShape(ShapeType name)
	{
		if(name==ShapeType.LINE)
			return new Line();
		else if(name==ShapeType.CIRCLE)
			return new Circle();
		else
			return null;
	}
}