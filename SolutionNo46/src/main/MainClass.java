package main;

import java.util.List;

import goldbachconjecture.GoldbachConjecture;
import math.CompositeOdd;

public class MainClass {

	public static void main(String[] args){
		int n = 10000;
		CompositeOdd compositeOdd = new CompositeOdd();
		GoldbachConjecture goldbachConjecture = new GoldbachConjecture();
		List<Integer> compositeOdds = compositeOdd.generate(n);
		List<Integer> goldbachNumbers = goldbachConjecture.generate(n, compositeOdds);
		System.out.println("The smallest odd composite that cannot be written as the "
				+ "sum of a prime and twice a square is " + 
				goldbachConjecture.getTheDifference(compositeOdds, goldbachNumbers));

	}

}
