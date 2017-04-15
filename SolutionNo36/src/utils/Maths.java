package utils;

import java.math.BigInteger;
import java.util.List;

public class Maths {

	public static BigInteger binary(int n){
		BigInteger binaryNumber;
		String bits = null;
		int nextNumber = 0;
		int bit = 0;
		while(n > 0){
			bit = n%2;
			if(bits == null){
				bits = String.valueOf(bit);
			} else {
				bits = String.valueOf(bit).concat(bits);
			}
			nextNumber = n/2;
			n = nextNumber;
		}
		binaryNumber = new BigInteger(bits);
		return binaryNumber;
	}

	public static boolean isPalindrome(BigInteger num){
		BigInteger rev = BigInteger.ZERO;
		BigInteger n = num;
		while(num.compareTo(BigInteger.valueOf(0)) == 1){
			int digit = num.mod(BigInteger.valueOf(10)).intValue();
			rev = rev.multiply(BigInteger.TEN).add(BigInteger.valueOf(digit));
			num = num.divide(BigInteger.valueOf(10));
		}
		if(n.equals(rev)){
			return true;
		}
		return false;
	}

	public static BigInteger sum(List<BigInteger> numbers){
		BigInteger sum = BigInteger.ZERO;
		for(int i = 0; i < numbers.size(); i++){
			sum = sum.add(numbers.get(i));
		}
		return sum;
	}

}
