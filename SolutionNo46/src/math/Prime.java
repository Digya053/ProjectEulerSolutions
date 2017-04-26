package math;

import java.util.List;
import java.util.ArrayList;

public class Prime {

	public List<Integer> generate(int n){
		List<Integer> primes = new ArrayList<>();
		for(int i = 0; i <= n; i++){
			if(isPrime(i)){
				primes.add(i);
			}
		}
		return primes;
	}


	public boolean isPrime(int n){
		if(n == 2 || n == 1){
			return true;
		} else if(n == 1 || n == 0 || n%2 == 0){
			return false;
		}
		for(int i = 3; i < n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}

}
