package com.upskill.java_5;

import com.upskill_java_6.myException;

public class Exception_TryCatchFinale {
	
	/* Java Exceptions - Use "try - catch - finally"
	 * 
		A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations
			 1. ArithmeticException - error has occurred in an arithmetic operation.
			 2. ArrayIndexOutOfBoundsException -  an array has been accessed with an illegal index.
			 3. ClassNotFoundException - try to access a class whose definition is not found
			 4. FileNotFoundException - a file is not accessible or does not open.
			 5. IOException - input-output operation failed or interrupted
			 6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
			 7. NoSuchFieldException - class does not contain the field or variable specified
			 8. NoSuchMethodException - accessing a method which is not found
			 9. NullPointerException - referring to the members of a null object
			 10. NumberFormatException  -  a method could not convert a string into a numeric format
			 11. RuntimeException - any exception which occurs during runtime.
			 12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string
		
		B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
	*/
	
	public static void main(String[] args) {
		try{
		
		int[] ageHulk = new int[]{30,28,27,26,30};
		System.out.println("Student age = " + ageHulk[8]);
				
		}
	
	catch(Exception e){
		e.printStackTrace();
	   System.out.println("Arry Method Completed");
	}
		
		try{
			int num = Integer.parseInt("five");
			   System.out.println(" num");
			
		}
		
		catch(NumberFormatException e){
			e.printStackTrace();
		   System.out.println("parsed Int from String complete");
		}
		
		// user Defined Exceptions
		try{
			throw new myException("Test");
		} catch (myException e){
			e.printStackTrace();
			System.out.println(" This is User-Defined Exception Method !");;
			
			
			
			
			
		}
			
		
	
	finally {
		System.out.println("Test Completed");
	}
}

}
	
	
	
	


