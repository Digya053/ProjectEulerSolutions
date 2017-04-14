package main;

import java.math.BigInteger;
import java.util.List;

import curiousnumber.CuriousNumber;
import utils.Maths;

public class MainClass {
	
	public static void main(String[] args){

		CuriousNumber curiousNumber = new CuriousNumber();
		BigInteger n = BigInteger.valueOf(100000);
		List<Integer> curiousNumbers = curiousNumber.generate(n);
		System.out.println("The sum of all the curious numbers is " + Maths.sum(curiousNumbers));
	}

}
