package main;

import java.math.BigInteger;
import utils.Maths;

public class MainClass {

	public static void main(String[] args){
		BigInteger number = new BigInteger("2");
		number = Maths.pow(number,1000);
		System.out.println("The number is "+number);
		System.out.println("The sum of the digits is "+Maths.findSumOfDigits(number));
	}
}
