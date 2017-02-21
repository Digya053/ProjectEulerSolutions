package main;

import calculate.FindDigits;
import utils.Number;
import utils.Sum;
import java.math.BigInteger;
import java.util.List;

public class MainClass {
	public static void main(String[] args){
		Sum sum = new Sum();
		BigInteger result = new BigInteger("0");
		List<BigInteger> nums = FindDigits.getDigits(Number.getNo(), 50);
		System.out.println("The 100 numbers with 50 digits are: "+nums);
		result = sum.find();
		System.out.println("The sum of all these numbers is: "+sum.find());
		System.out.println("The first ten digits of the sum is: "+ result.toString().
				substring(0, 10));
	}

}
