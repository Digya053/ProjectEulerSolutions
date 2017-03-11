package utils;

import java.math.BigInteger;

public class Maths {

	public BigInteger factorial(int n){
		BigInteger factorial = BigInteger.ONE;
		for(int i = n; i>0; i--){
			factorial = factorial.multiply(BigInteger.valueOf(i));		
		}	
		return factorial;	
	}

	public BigInteger sum(BigInteger n){
		BigInteger sumOfDigits = BigInteger.ZERO;
		while(n.compareTo(BigInteger.ZERO) == 1){
		BigInteger quotient = n.divide(BigInteger.valueOf(10));
		BigInteger remainder = n.mod(BigInteger.valueOf(10));
		sumOfDigits = sumOfDigits.add(remainder);
		n = quotient;
		}
		return sumOfDigits;
	}
}
