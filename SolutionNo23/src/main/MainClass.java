package main;

import abundant.AbundantNumbers;

public class MainClass {
	
	public static void main(String[] args){
		AbundantNumbers abundantNumbers = new AbundantNumbers();
		System.out.println("The sum is "+ abundantNumbers.checkSumAvailable());
	}

}
