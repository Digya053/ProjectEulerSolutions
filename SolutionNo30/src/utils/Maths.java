package utils;

import java.math.BigInteger;
import java.util.List;

public class Maths {

	public static BigInteger raisePowerOfEachDigit(List<Integer> number, int n){
		BigInteger add  = BigInteger.ZERO;
		for(int i = 0 ; i<number.size(); i++){
			BigInteger raisedPower = BigInteger.valueOf(number.get(i)).pow(n);
			add = add.add(raisedPower);
		}
		return add;
	}
	
	public static BigInteger sum (List<Integer> numbers){
		BigInteger sum = BigInteger.ZERO;
		for(int i = 0 ; i<numbers.size(); i++){
			sum = sum.add(BigInteger.valueOf(numbers.get(i)));
		}
		return sum;
	}
}
