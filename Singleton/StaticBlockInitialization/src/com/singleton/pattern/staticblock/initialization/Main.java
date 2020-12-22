package com.singleton.pattern.staticblock.initialization;

public class Main {

	public static void main(String[] args) {	
		StaticBlockInitializationSingleton instance = StaticBlockInitializationSingleton.getInstance();
		instance.printMessage();
	}
}