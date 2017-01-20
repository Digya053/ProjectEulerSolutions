package main;

import main.CalculateNumber;

public class MainClass {
	private static int sumOfSquare;
	private static int squareOfSum;

	public static void main(String[] args){
		CalculateNumber number = new CalculateNumber();
		sumOfSquare = number.sumOfSquare();
		squareOfSum = number.squareOfSum();
		int difference = squareOfSum- sumOfSquare;
		System.out.println("The sum of square of the numbers is "+sumOfSquare);
		System.out.println("The square of sum of the numbers is "+squareOfSum);
		System.out.println("The difference is "+difference);
		
	}
}
