package com.upskill.java_5;

public interface Interface {
	
	 //interface can have only abstract method, java 8 and forward they have static method too
	// abstract method doesn't have any implementation
	
	public abstract void iDoor(); 
	
	public abstract void iwheel();
	
	public abstract void iSeat();
	
	public abstract String iColor();
	
	
	/*
    (Parent)				   (Keyword) 				(Child)					 (Keyword) 					(GrandChild)
    						
	Class						extends					 Class		 
	Abstract Class				extends				     Class
	Interface 			  		implements				 Class
	Interface 				 	extends					 Interface    												Class
	Interface 		  									 Abstract Class
	Abstract Class 		 								 Interface   												Class	
*/
	
	
	
	
	
	
}
