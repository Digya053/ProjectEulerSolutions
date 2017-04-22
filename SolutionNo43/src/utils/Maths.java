package utils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Maths {

	public static boolean checkProperty(String pandigitalNumber){
		try{
			double divisible2 = Double.valueOf(String.valueOf(pandigitalNumber.charAt(1)) + 
					String.valueOf(pandigitalNumber.charAt(2)) + String.valueOf(pandigitalNumber.charAt(3)));
			double divisible3 = Double.valueOf(String.valueOf(pandigitalNumber.charAt(2)) + 
					String.valueOf(pandigitalNumber.charAt(3)) + String.valueOf(pandigitalNumber.charAt(4)));
			double divisible5 = Double.valueOf(String.valueOf(pandigitalNumber.charAt(3)) + 
					String.valueOf(pandigitalNumber.charAt(4)) + String.valueOf(pandigitalNumber.charAt(5)));
			double divisible7 = Double.valueOf(String.valueOf(pandigitalNumber.charAt(4)) + 
					String.valueOf(pandigitalNumber.charAt(5)) + String.valueOf(pandigitalNumber.charAt(6)));
			double divisible11 = Double.valueOf(String.valueOf(pandigitalNumber.charAt(5)) + 
					String.valueOf(pandigitalNumber.charAt(6)) + String.valueOf(pandigitalNumber.charAt(7)));
			double divisible13 = Double.valueOf(String.valueOf(pandigitalNumber.charAt(6)) + 
					String.valueOf(pandigitalNumber.charAt(7)) + String.valueOf(pandigitalNumber.charAt(8)));
			double divisible17 = Double.valueOf(String.valueOf(pandigitalNumber.charAt(7)) + 
					String.valueOf(pandigitalNumber.charAt(8)) + String.valueOf(pandigitalNumber.charAt(9)));

			if(checkDivisibility(divisible2, 2) && checkDivisibility(divisible3, 3) && 
					checkDivisibility(divisible5, 5) && checkDivisibility(divisible7, 7) &&
					checkDivisibility(divisible11, 11) && checkDivisibility(divisible13, 13) && 
					checkDivisibility(divisible17, 17)){
				return true;
			} else {
				return false;
			}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean checkDivisibility(double number, double divisibleBy){
		if(number%divisibleBy == 0){
			return true;
		} else {
			return false;
		}
	}

	public static String sortString (BigInteger n){
		String number = n.toString();
		char[] c = number.toCharArray();
		Arrays.sort(c);
		String sortedNumber = new String(c);
		return sortedNumber;

	}

	public static BigInteger sum(List<BigInteger> pandigitalWithProperty){
		BigInteger sum  = BigInteger.ZERO;
		for(int i = 0; i < pandigitalWithProperty.size(); i++){
			sum = sum.add(pandigitalWithProperty.get(i));
		}
		return sum;
	}
}
