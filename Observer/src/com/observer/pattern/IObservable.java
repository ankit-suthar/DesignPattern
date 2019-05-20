package com.observer.pattern;

public interface IObservable {
	
	void add(Observer observer);
	void remove(Observer observer);
	void notifyMethod();
	
}