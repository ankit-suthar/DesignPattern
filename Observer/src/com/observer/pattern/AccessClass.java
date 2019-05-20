package com.observer.pattern;

import java.util.Scanner;

public class AccessClass {

	public static void main(String[] args) {
		Observable ob = new Observable();
		Scanner s =  new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1 - Add Observer");
			System.out.println("2 - Change Value");
			int n = s.nextInt();
			if(n==1)
			{
				System.out.println("Enter Id: ");
				int id = s.nextInt();
				Observer o = new Observer(ob,id);
				ob.add(o);
			}
			else if(n==2)
			{
				System.out.println("Enter temp value: ");
				float temp = s.nextFloat();
				ob.temperature=temp;
				ob.notifyMethod();
			}
			else
				break;
		}
		s.close();
	}
}