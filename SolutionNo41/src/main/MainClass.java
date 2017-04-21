package main;

import pandigital.Pandigital;
import utils.Maths;

public class MainClass{
	
	public static void main(String[] args){
		
		System.out.println(Maths.isPrime(1));
		
		Pandigital pandigital = new Pandigital();
		pandigital.getPandigitalNumbers(10);
	}

}
