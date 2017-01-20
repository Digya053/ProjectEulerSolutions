package main;

import findnumber.CalculateNum;

public class MainClass {

	public static void main(String[] args){
		CalculateNum number = new CalculateNum();
		System.out.println("The smallest number divisible by all the numbers from 1 to 20 is "
				+number.divisible());

	}

}
