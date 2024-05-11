package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Arry_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
	
		//int age = 25;
		int [] ageHulk = new int []{25,30,35,38,43,38};
	String [] NameHulk = new String []{"munna","radwan","basher","rabib","adnan"};
	System.out.println("Name of Student :" + NameHulk[3]);
	
		

	System.out.println("Student Age :"  + ageHulk[3]);
    System.out.println("Total Student :" + ageHulk.length);
    
    //Multi-Dimentional Array
    int [][] ageHulk2D = {{25,30,35,38,43,28},
    		              {23,32,38,27}};
    
    System.out.println("Student Age 2D : " + ageHulk2D[0][0]);
    
    //
    
    HashMap<String,Integer> Student = new HashMap<String,Integer>();
    
    Student.put("Radwan",27);
    Student.put("sana",31);
    Student.put("sanam",38);
    Student.put("Munna",24);
    
    System.out.println("HashMap Student Age:"+ Student.get("sanam"));
    
    HashMap<String,String> Country = new HashMap<String,String>();
    
    Country.put("Bd", "Dhaka");
    Country.put("USA","Washington DC");
    
    System.out.println("Capital city:"+ Country.get("BD"));
    
    
    
   Hashtable<String,String> Region= new Hashtable<String,String>();
    
    Region.put("Bd", "Dhaka");
    Region.put("USA","Washington DC");
    
    System.out.println("Region:"+ Region.get("BD"));
	
	
    HashSet<String> car = new HashSet<String>();
    car.add("Audi");
    car.add("BMW");
    car.add("Tesla");
    car.add("Range Rover");
    
    System.out.println("Car:"+ car);
    
    
	} 
    
}
    		
    
    		              


    
    


