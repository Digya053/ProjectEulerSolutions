package prime;

import java.util.ArrayList;
import java.util.List;

import utils.Maths;

public class PrimeNumbers {

	public boolean isPrime(int n){
		if(n == 2){
			return true;
		}

		if(n == 0 || n == 1 || n%2 == 0){
			return false;
		}

		for(int i = 3; i<n ; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}


	public List<Integer> findPrimesOnForwardRemoval(int n){
		List<Integer> forwardPrimes = new ArrayList<>();
		int nextNum = 0;

		for(int i = 10; i < n; i++){
			String number = String.valueOf(i);
			int count = 0;
			if(!isPrime(i)){
				continue;
			}
			count++;

			nextNum = i;

			for(int j = 0; j < number.length()-1; j++){
				nextNum = Maths.removeDigitFromLeft(nextNum);
				if(isPrime(nextNum)){
					count++;
				} else{
					break;
				}
				if(count == number.length()){
					forwardPrimes.add(i);
				}
			}
		}
		return forwardPrimes;
	}


	public List<Integer> findPrimesOnBackwardRemoval(int n){
		List<Integer> backwardPrimes = new ArrayList<>();
		int nextNum = 0;

		for(int i = 10; i < n; i++){
			String number = String.valueOf(i);
			int count = 0;
			if(!isPrime(i)){
				continue;
			}
			count++;

			nextNum = i;

			for(int j = 0; j < number.length()-1; j++){
				nextNum = Maths.removeDigitFromRight(nextNum);
				if(isPrime(nextNum)){
					count++;
				} else{
					break;
				}
				if(count == number.length()){
					backwardPrimes.add(i);
				}
			}
		}
		return backwardPrimes;
	}

	
	public List<Integer> findTruncatedPrimes(List<Integer> forwardPrimes, List<Integer> backwardPrimes){
		List<Integer> truncatedPrimes = new ArrayList<>();
		for(Integer expectedTruncated : backwardPrimes){
			if(forwardPrimes.contains(expectedTruncated)){
				truncatedPrimes.add(expectedTruncated);
			}
		}
		return truncatedPrimes;
	}

}

