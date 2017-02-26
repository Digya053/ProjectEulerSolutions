package utils;

import java.math.BigInteger;

public class Count {
	private static BigInteger sum = BigInteger.ZERO;
	public static BigInteger letters(String word){
		word = word.replaceAll("\\s", "");
		sum = sum.add(BigInteger.valueOf(word.length()));
		return sum;
	}
}
