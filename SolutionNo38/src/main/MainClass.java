package main;

import java.util.List;

import pandigital.PandigitalNumbers;
import utils.Maths;

public class MainClass {

	public static void main(String[] args){

		PandigitalNumbers pandigitalNumbers = new PandigitalNumbers();
		List<String> sortedNumberList =  pandigitalNumbers.multiplyAndConcatenate(10000);
		System.out.println("The maximum pandigital number containing 1-9 is " + Maths.max(sortedNumberList));
	}

}
