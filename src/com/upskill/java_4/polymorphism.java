package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class polymorphism extends MethodType {
	
	/*  	Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	 
	 	public static void main(String[] args) {
		
	 	polymorphism obj = new polymorphism();
	 	obj.annualIncomevoid();
		car();
		car("red");
		car("red",4);
		car("Black", 4, 5);
		
		
		
	 	}
	 	//Method Overloading - Compile time Polymorphism - Static binding
		//Same method name with different signature
	 	
	 	//Method Overriding - Runtime Polymorphism - Dynamic binding
		//Same method name from Parent class to override
	 	
	 	public void annualIncomevoid(){
	 		int rentalIncome = 25000;
	 		int cripto = 20000;
	 		int business = 25000;
	 		int calculateAnnualIncome = hourLyIncome * 2000 + rentalIncome + cripto + business;
	 		System.out.println("My Annual Income = " + calculateAnnualIncome);
	 		
	 	}
	 	
	public static void car(){
		System.out.println ("my car is Tesla");
	}
	 	
	 	public static void car(String color){
	 		System.out.println("my car is tesla,color is " + color);
	 			
	 			
	 		}
	 	public static void car(String color, int door){
	 		System.out.println("my car is tesla,color is"+ color + "it has door "+ door);
	 				
	 	
	}
	 	
	 	public static void car(String color,int door,int seat){
			System.out.println ("my car is Tesla " + "color is "+ color + ", it has "+ door + " doors" + ", it has " + seat + " seats");
	}

}
