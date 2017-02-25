package utils;

import java.math.BigInteger;

public class Maths {

	public static BigInteger findSumOfDigits(BigInteger num){
		BigInteger ten = BigInteger.TEN;
		BigInteger sum = BigInteger.ZERO;
		BigInteger quotient = BigInteger.ONE;

		while(quotient.compareTo(BigInteger.ZERO)==1){
			quotient = num.divide(ten);
			BigInteger remainder = num.remainder(ten);
			sum = sum.add(remainder);
			num = quotient;
		}
		return sum;
	}

	public static BigInteger pow(BigInteger num, int power){
		BigInteger nextNum = new BigInteger("2");
		for (int i =1; i<power; i++){
			nextNum = nextNum.multiply(num);
		}
		return nextNum;
	}
}
