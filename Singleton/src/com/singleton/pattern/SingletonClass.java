package com.singleton.pattern;

public class SingletonClass {
	
	static private SingletonClass Object;
	
	private SingletonClass()
	{
		
	}
	
	public static synchronized SingletonClass getInstance()
	{
		if(Object==null)
			Object = new SingletonClass();
		return Object;
	}
	
	public void printMessage()
	{
		System.out.println("Signleton Pattern Message");
	}
}
