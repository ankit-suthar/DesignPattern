package com.singleton.pattern.staticblock.initialization;

public class StaticBlockInitializationSingleton {

	private static StaticBlockInitializationSingleton object;
	
	private StaticBlockInitializationSingleton() { }

	//static block initialization for exception handling
	static{
		try{
			object = new StaticBlockInitializationSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static synchronized StaticBlockInitializationSingleton getInstance() {
		return object;
	}
	
	public void printMessage() {
		System.out.println("Static Block Initialization Singleton Pattern Message");
	}
}
