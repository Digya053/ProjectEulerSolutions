package main;

import spiral.UlamSpiral;

public class MainClass {
	
	public static void main(String[] args){
		UlamSpiral ulam = new UlamSpiral();
		System.out.println("The sum of the diagonal is " + ulam.function(500));
	}

}
