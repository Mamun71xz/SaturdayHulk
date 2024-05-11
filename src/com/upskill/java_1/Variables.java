package com.upskill.java_1;

public class Variables {
	
	public String country = "USA";
	public static String region = "North America";
	
			
	
//	Variables in Java
	
//	Instance OR global variable - Variables declared in Class level, outside method
//	Static variable - variables belong to class and don't required creating object
//	Local variable - variables declared in methods 
//	Method parameter - variables used as method parameter
	
 public static void main (String[] args) {
	 ny("Kings");
	 nj("Essex");
	 ct(Fairfield);
	 Variables myobj = new Variables();
	 System.out.println(myobj.country);
	 System.out.println(region);
 }
  public static void ny (String country){
	  String city = "Queens";
	  System.out.println(city);
	  String mycountry = country;
	  System.out.println(mycountry);
	  
  }
  public static void nj (String country){
	  String city = "Bloomfield";
	  System.out.println(city);
	  
	  String mycountry = country;
	  System.out.println(mycountry);
  }
  public static void ct(){
	  String city = "Hartford";
	  System.out.println(city);
  }
}
