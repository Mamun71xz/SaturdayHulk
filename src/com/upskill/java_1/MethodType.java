package com.upskill.java_1;

public class MethodType {

		/* 	Types of Methods
		 
		1.Void Method
		2.Static Method
		3.Return Type Method  
	 */
		public static int hourLyIncome = 65;
		public static void main(String[]args){
			MethodType myObj = new MethodType();
			myObj.annualIncomevoid();
			
			System.out.println("My Annual Income ="+ myObj.monthlyIncomeReturn());
			WeeklyIncomeStatic();
			
		}

		public void annualIncomevoid(){
			int calculateAnnualIncome = hourLyIncome * 2000;
			System.out.println("My Annual Income =" + calculateAnnualIncome);
			
			
			
			
		}
		
		public int monthlyIncomeReturn(){
			int calculateMonthlyIncome = hourLyIncome * 180;
			return calculateMonthlyIncome;
		}
	

		public static void WeeklyIncomeStatic(){
			int calculateWeeklyIncome = hourLyIncome * 40;
			System.out.println("My Weekly Income = " + calculateWeeklyIncome);
			
		}
		
		public static boolean staticReturn(){ 
			return true;
			
			
			
			
		}
}

