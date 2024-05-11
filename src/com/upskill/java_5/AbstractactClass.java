package com.upskill.java_5;

public abstract class AbstractactClass {
	
	public void car(){
		System.out.println("My car is Tesla"); // abstract class have regular method as well as abstract method
		                                       // regular class have only regular method ***
	}

	public void Door(){
		System.out.println("My car has 4 door");
	}
		
	public abstract void iDoor();
	
	public abstract void iWheel();
	
	public abstract void iSeat();
	
	public abstract String iColor();
	
	
	
	}

