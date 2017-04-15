package utils;

public class Maths {

	public static int countDigits(int n){
		int count = 0;
		while(n > 0){
			n = n/10;
			count ++;
		}
		return count;
	}

	public static int rotate(int n){
		int remainder = n % 10;
		remainder *= Math.pow(10, countDigits(n) - 1);
		int remainingNumbers = n/10;
		remainder += remainingNumbers;
		return remainder;
	}

	public static boolean isPrime(int n){
		if(n == 2){
			return true;
		}
		if(n % 2 == 0){
			return false;
		}
		for(int i = 3; i < n ; i ++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

}
