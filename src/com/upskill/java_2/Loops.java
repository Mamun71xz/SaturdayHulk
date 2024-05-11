package com.upskill.java_2;

public class Loops {
/*
  Type of Loops
  1. for loop
  2.while loop
  3.Do while loop
  4.Infinite loop
 */
	public static void main(String[] args) {
		 //practiceForLoop();
		 //practiceWhileLoop();
        // practicedoWhileLoop();
		//practiceinfinitLoop();
		 practicNestedForLoop();
		
		
		}
	
public static void practiceForLoop(){   //for loop-do again and again upto upper limit
	int i;                              //initialize the variable
	for (i=1; i<=10; i++){              //setting lower level,upper level,increment or decrement
		System.out.println("For Loops number =" +i); //statement
		
		
	}
}
	
		public static void practiceWhileLoop(){
		 int i= 1;
		 while(i<=10){
			 System.out.println("While Loops Number =" + i);
			 i++;
		 }
	 }
	 
	public static void practicedoWhileLoop(){
	   int i = 1;
	   do {
		   System.out.println("Do While Loops number = "+ i);
		   i++;
	   } while (i<=10);
	}
	   
	   public static void practiceinfinitLoop(){   
			int i;                              
			for (i=1;;i++){              
				System.out.println("Infinite Loops number =" +i); 
				
				
    }
	
	
}
	   public static void practicNestedForLoop(){
		   int i;
		   int j;
		   for (i=1; j<=10;j++){
			  int multipacationTable = i * j;
			  System.out.print(multi);
			  
		   }
		   System.out.println(" ");
	   }
		   
	   }
	
