package com.abstractfactory.pattern;

public abstract class AbstractFactory {
	abstract GeometricShape getShape(ShapeType name);
}
