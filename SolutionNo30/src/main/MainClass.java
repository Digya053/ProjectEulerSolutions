package main;

import java.util.ArrayList;
import java.util.List;

import utils.Digits;
import utils.Maths;

public class MainClass {

	public static void main(String[] args){
		List<Integer> number = new ArrayList<Integer>();
		for(int i = 2; i< 1000000; i++){
			List<Integer> digits = Digits.breakDigit(i);
			int raisedPower = Maths.raisePowerOfEachDigit(digits, 5).intValue();
			if(raisedPower == i){
				number.add(i);
			}

		}
		System.out.println("The sum of all the numbers are " + Maths.sum(number));

	}

}
