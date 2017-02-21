package utils;

import java.math.BigInteger;
import java.util.List;

import calculate.FindDigits;

public class Sum {
	public BigInteger find(){
		BigInteger sum = BigInteger.ZERO;
		List<BigInteger> no = FindDigits.getDigits(Number.getNo(), 50);
		for(int i = 0; i<no.size(); i++){
			sum = sum.add(no.get(i));
		}
		return sum;
	}

}
