package utils;

import java.util.ArrayList;
import java.util.List;

public class Digits {
	static List<Integer> digits = new ArrayList<Integer>();

	public static List<Integer> breakDigit(int n){
		digits.clear();
		while(n > 0){
			int digit = n%10;
			n /= 10;
			digits.add(digit);
		}
		return digits;
	}

}
