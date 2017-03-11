package main;

import java.util.List;

import amicable.AmicableNumbers;
import utils.Maths;

public class MainClass {

	public static void main(String[] args){
		AmicableNumbers numbers = new AmicableNumbers();
		List<Integer> amicableNumbers = numbers.find(10000);
		System.out.println("The amicable numbers are " + amicableNumbers);
		System.out.println("The sum of all the amicable numbers is " + Maths.sum(amicableNumbers));

	}

}
