package utils;

import java.math.BigInteger;

public class Factorial {

	public static BigInteger get(int n){
		BigInteger factorial = BigInteger.ONE;
		for(int i = 2; i <= n ; i++){
			factorial  = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}

}
