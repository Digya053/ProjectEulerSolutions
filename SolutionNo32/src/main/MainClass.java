package main;

import java.math.BigInteger;
import java.util.List;

import pandigital.Pandigital;
import sum.Sum;

public class MainClass {

	public static void main(String[] args){

		Pandigital pandigital = new Pandigital();
		List<BigInteger> pandigitalNumbers = pandigital.findPandigital();
		System.out.println("The sum of pandigital numbers is " + Sum.findSum(pandigitalNumbers));

	}

}
