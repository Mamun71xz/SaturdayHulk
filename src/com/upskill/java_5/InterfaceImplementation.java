package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
	}

	@Override
	public void iwheel() {
		System.out.println("My car has 4 wheel");
		
	}

	@Override
	public void iSeat() {
		System.out.println("My car has 4 seat");
		
	}

	@Override
	public String iColor() {
	System.out.println("My car is RED");
		return "RED";
	}
	
	

}
