package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import recurrence.RecurrenceCycle;
import utils.Maths;

public class MainClass {
	static List<BigInteger> size = new ArrayList<BigInteger>();

	public static void main(String[] args){

		RecurrenceCycle recurrence = new RecurrenceCycle();

		for(int i = 2; i<1000; i++){
			BigInteger length = recurrence.find(i);
			size.add(length);
		}

		BigInteger max = Maths.max(size);
		System.out.println("The maximum recurring cycle is " + max);

		int number = size.indexOf(max) + 2;

		if(size.contains(max)){
			System.out.println("The number with maximum recurring cycle is " +  number);
		}
	}
}
