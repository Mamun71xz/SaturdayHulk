package com.upskill.java_4;

public class Encapsulation {
     // Encapsulation used to hide the data using setter and getter method
	// PPI and PHI(PRIVETE health information) ARE PROTECTED
	
	private String name = "upskill";
	private int ssn = 45875126;
	private String username = "raselualam";
	
	//Setter Method - name               //set the data,Write
	public void setNAME(String value){
		 name = value;
		 }
	
	 //Getter Method - name              //get the data,read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn                //set the data,write
	public void setSSN(int value){
		ssn = value;
	}

 //Getter method - username             //get the data,read
	public String getUserName(){
		return username;
		
	}
	
	public static void main(String[] args){
		Encapsulation obj = new Encapsulation();
		obj.setNAME("Muazzaem601");
		System.out.println(obj.getName());
		obj.setSSN(999999);
		System.out.println(obj.getUserName());
		
	}
}


