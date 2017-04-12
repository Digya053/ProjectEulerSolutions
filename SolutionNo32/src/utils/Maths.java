package utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Maths {

	public static List<Integer> breakNumberToDigitAndList(BigInteger firstNum, BigInteger secondNum,
			BigInteger thirdNum){
		List<Integer> allDigits = new ArrayList<Integer>();
		List<Integer> firstNumDigits = breakNum(firstNum);
		allDigits.addAll(firstNumDigits);
		List<Integer> secondNumDigits = breakNum(secondNum);
		allDigits.addAll(secondNumDigits);
		List<Integer> thirdNumDigits = breakNum(thirdNum);
		allDigits.addAll(thirdNumDigits);
		return allDigits;	
	}

	public static List<Integer> breakNum(BigInteger num){
		List<Integer> digits = new ArrayList<Integer>();
		int digit = 0;
		while(num.compareTo(BigInteger.ZERO) == 1){
			digit = num.mod(BigInteger.TEN).intValue();
			digits.add(digit);
			num = num.divide(BigInteger.TEN);
		}
		return digits;
	}

}