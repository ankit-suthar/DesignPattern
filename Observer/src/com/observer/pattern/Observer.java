package com.observer.pattern;

public class Observer implements IObserver,IDisplay {

	Observable ob;
	int id;
	
	public Observer(Observable ob,int id)
	{
		this.ob=ob;
		this.id=id;
	}
	
	@Override
	public void update() 
	{
		float t = this.ob.getTemperature();
		this.display(t);
	}

	@Override
	public void display(float t) 
	{
		System.out.println(id+" "+t);
	}
	
	public boolean equals(Object obj)
	{
		Observer o = (Observer)obj;
		return this.id==o.id;
	}
}