package utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Maths {

	public static List<Integer> getDigitsFromNumber(int n){
		List<Integer> digits = new ArrayList<>();
		int digit = 0;
		while(n > 0){
			digit = n % 10;
			digits.add(digit);
			n /=10;
		}
		return digits;
	}
	
	public static BigInteger sum(List<Integer> digits){
		BigInteger sum =  BigInteger.ZERO;
		for(int i = 0; i < digits.size(); i++){
			sum = sum.add(BigInteger.valueOf(digits.get(i)));
		}
		return sum;
	}

}
