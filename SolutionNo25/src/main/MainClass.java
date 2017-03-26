package main;

import java.math.BigInteger;
import java.util.List;

import fibonacci.FibonacciSeries;

public class MainClass {

	public static void main(String[] args){
		BigInteger limit = BigInteger.valueOf(5000);
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		List<BigInteger> fibonacciNo = fibonacciSeries.generate(limit);
		System.out.println("The first fibonacci number with 1000 digit is " + 
				fibonacciSeries.findNo(fibonacciNo));

	}

}
