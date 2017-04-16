package main;

import java.util.List;

import prime.PrimeNumbers;
import utils.Maths;

public class MainClass {
	
	public static void main(String[] args){
		
	PrimeNumbers primeNumbers = new PrimeNumbers();
	
	List<Integer> forwardPrimes = primeNumbers.findPrimesOnForwardRemoval(800000);
	System.out.println("The left truncatable primes are "  +forwardPrimes);
	
	List<Integer> backwardPrimes = primeNumbers.findPrimesOnBackwardRemoval(800000);
	System.out.println("The right truncatable primes are " + backwardPrimes);
	
	List<Integer> truncatedPrimes = primeNumbers.findTruncatedPrimes(forwardPrimes, backwardPrimes);
	System.out.println("Both left-right truncated primes are " + truncatedPrimes);
	
	System.out.println("The sum of both left-right trucated primes is " + Maths.sum(truncatedPrimes));
	}

}
