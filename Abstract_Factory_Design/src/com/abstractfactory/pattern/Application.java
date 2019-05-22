package com.abstractfactory.pattern;

public class Application {

	public static void main(String[] args) {
	
		AbstractFactory factory = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
	
		if (factory == null) 
		{
			System.out.println("Factory for given name doesn't exist.");
			System.exit(1);
		}
		
		GeometricShape shape = factory.getShape(ShapeType.CIRCLE);
		
		if (shape != null)
      shape.draw();
		else 
      System.out.println("Shape with given name doesn't exist.");
		
		factory = FactoryProvider.getFactory(FactoryType.THREE_D_SHAPE_FACTORY);
		
		if (factory == null) 
		{
			System.out.println("Factory for given name doesn't exist.");
			System.exit(1);
		}
		
		shape = factory.getShape(ShapeType.SPHERE);

		if (shape != null)
      shape.draw();
		else 
      System.out.println("Shape with given name doesn't exist.");
	}
}