package main;

import java.math.BigInteger;

import utils.Maths;

public class MainClass {
	
	public static void main(String[] args){
		Maths m = new Maths();
		BigInteger factorial = m.factorial(100);
		System.out.println("The factorial is " + factorial);
		BigInteger sum = m.sum(factorial);
		System.out.println("The sum of all the digits is " + sum);
	}

}
