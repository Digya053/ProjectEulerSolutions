package main;

import fraction.Fraction;

public class MainClass {
	
	public static void main(String[] args){
		Fraction fraction = new Fraction();
		System.out.println("The value of the denominator in lowest common terms is " +
				fraction.generateFractionAndGetLcm());
	}

}
