package utils;

import java.util.ArrayList;
import java.util.List;

public class Maths {
	static List<Integer> digits = new ArrayList<Integer>();
	
	public static List<Integer> getDigitsFromNumber(int num){
		digits.clear();
		while(num > 0){
			int digit = num % 10;
			digits.add(digit);
			num /= 10;
		
		}
		return digits;
		
	}

}
