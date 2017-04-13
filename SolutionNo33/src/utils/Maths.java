package utils;

import java.util.LinkedList;
import java.util.List;

public class Maths {

	public List<Integer> convertNumberToDigit(double num){
		int number = (int) num;
		List<Integer> digits = new LinkedList<>();
		while(num > 0){
			int digit = number % 10;
			digits.add(digit);
			//System.out.println(digit);
			number /= 10;
		}
		//System.out.println("num is " + num + "list of digits is " + digits);
		return digits;
	}
}
