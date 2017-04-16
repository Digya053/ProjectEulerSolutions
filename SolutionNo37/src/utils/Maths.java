package utils;

import java.math.BigInteger;
import java.util.List;

public class Maths {

	public static int removeDigitFromLeft(int n){
		String number = String.valueOf(n);
		n = (int) (n % (Math.pow(10, number.length()-1)));
		return n;
	}
	
	public static int removeDigitFromRight(int n){
		n = n/10;
		return n;
	}
	
	public static BigInteger sum(List<Integer> truncatedPrimes){
		BigInteger sum = BigInteger.ZERO;
		for(int i = 0; i<truncatedPrimes.size(); i++){
			sum = sum.add(BigInteger.valueOf(truncatedPrimes.get(i)));
		}
		return sum; 
	}

}
