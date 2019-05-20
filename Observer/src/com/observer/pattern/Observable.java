package com.observer.pattern;

import java.util.HashSet;
import java.util.Iterator;

public class Observable implements IObservable {

	HashSet<Observer> hs = new HashSet<Observer>();
	float temperature;
	
	@Override
	public void add(Observer observer) 
	{
		this.hs.add(observer);
	}

	@Override
	public void remove(Observer observer) 
	{
		this.hs.remove(observer);
	}

	@Override
	public void notifyMethod() 
	{	
		Iterator<Observer> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			Observer ob = itr.next();
			
			ob.update();
		}
	}
	
	public float getTemperature()
	{
		return this.temperature;
	}
}