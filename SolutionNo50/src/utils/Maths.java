package utils;

import java.util.ArrayList;
import java.util.List;

public class Maths {
	
	public static boolean isPrime(int n){
		if(n == 2){
			return true;
		} else if(n == 1 | n % 2 == 0){
			return false;
		}
		for(int i = 3; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			} 
		}
		return true;
	}

	public static List<Integer> generatePrimeNumbers(int n){
		List<Integer> primeNumbers = new ArrayList<>();
		for(int i = 2; i < n; i++){
			if(isPrime(i)){
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	}
