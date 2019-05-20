package com.singleton.pattern;

public class MainClass {

	public static void main(String[] args) {	
		SingletonClass sc = SingletonClass.getInstance();
		sc.printMessage();
	}
}