package main;

import consecutive.Consecutive;

public class MainClass {
	
	public static void main(String[] args){
	
		Consecutive consecutive = new Consecutive();
		System.out.println("The longest sum of consecutive primes below one million is " + 
				consecutive.generateMaximumConsecutive(1000000));
		
	}
}