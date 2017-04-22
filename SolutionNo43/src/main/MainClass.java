package main;

import java.math.BigInteger;
import java.util.List;

import pandigital.PandigitalNumbers;
import utils.Maths;

public class MainClass {

	public static void main(String[] args){

		PandigitalNumbers pandigitalNumbers = new PandigitalNumbers();

		List<BigInteger> pandigitalWithProperty = pandigitalNumbers.getPandigitalsWithProperty
				(BigInteger.valueOf(4166666666L));

		System.out.println("The sum of all the pandigital numbers with the satisfaction of property is " +
				Maths.sum(pandigitalWithProperty));
	}

}
