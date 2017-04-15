package main;

import java.util.List;

import circularprimes.CircularPrime;

public class MainClass {
	
	public static void main(String[] args){
		
		CircularPrime circularPrime = new CircularPrime();
		
		int n = 1000000;
		List<Integer> circularPrimes = circularPrime.find(n);
		
		System.out.println("Circular Primes upto " + n + " are " + circularPrimes);
		System.out.println("Total count of circular primes upto " + n + " = " + circularPrime.count(circularPrimes));
	
	}

}
