package main;

import java.util.List;

import pandigital.PandigitalPrime;
import utils.Maths;

public class MainClass {
	
	public static void main(String[] args){
		
		PandigitalPrime pandigitalPrime = new PandigitalPrime();
		
		List<Integer> pandigitalPrimes = pandigitalPrime.findPandigitalPrimes(7700000);
		System.out.println(pandigitalPrimes);
		
		System.out.println("The maximum pandigital prime is " + Maths.max(pandigitalPrimes));
	}

}
