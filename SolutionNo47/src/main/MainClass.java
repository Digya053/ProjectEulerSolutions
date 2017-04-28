package main;

import java.util.List;

import prime.Prime;

public class MainClass {

	public static void main(String[] args){

		Prime prime = new Prime();
		List<Integer> consecutivePrimes = prime.findThreeConsecutivePrimes(135000);

		System.out.println("The consecutive primes are " + consecutivePrimes);
		System.out.println("The first of the numbers to have 4 consecutive primes is " + consecutivePrimes.get(0));
	}
}
