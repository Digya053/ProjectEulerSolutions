package main;

import pentagon.PentagonalNumbers;

public class MainClass {
	
	public static void main(String[] args){
		
		PentagonalNumbers pentagonalNumbers = new PentagonalNumbers();
		System.out.println("The list of pentagonal numbers: ");
		System.out.println(pentagonalNumbers.getPentagonalNumbers(3000));
		System.out.println("    ");
		System.out.println("The difference between two pentagonal numbers for which both sum and difference "
				+ "are pentagonal is " + pentagonalNumbers.findDifference());
		
		
	}

}
