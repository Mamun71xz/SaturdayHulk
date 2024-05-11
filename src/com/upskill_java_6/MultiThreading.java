package com.upskill_java_6;

public class MultiThreading {
	

	
 public static void main(String[] arges){
	 
	int n = 10;
	
	for(int i = 0; i < n; i++){
		
		MultitreadingThread obj = new MultitreadingThread();
		obj.start();
		
		Thread obj2 = new Thread(new MultithreadingRunable());
		obj2.start();
	}
}

		
	
	 
	 
 }
	
	
	
