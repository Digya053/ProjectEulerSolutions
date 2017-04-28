package prime;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public boolean isPrime(int n){
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

	public List<Integer> generateFactors(int n){
		List<Integer> primeFactors = new ArrayList<>();
		for(int i = 2; i<n; i++){
			if (isPrime(i)){
				if(n % i == 0){
					primeFactors.add(i);
				}
			} 
		}
		return primeFactors;
	}

	public List<Integer> findThreeConsecutivePrimes(int n){
		List<Integer> consecutivePrimes = new ArrayList<>();
		for(int i = 2; i<=n; i++){
			List<Integer> primeFactors = this.generateFactors(i);

			if(primeFactors.size() == 4){
				int count = 1;
				int primeConsecutive = i;
				for(int j = 0; j < 3; j++){
					primeConsecutive = primeConsecutive + 1;
					primeFactors = this.generateFactors(primeConsecutive);
					if(primeFactors.size() == 4){
						count++;
					}

				}
				if(count == 4){
					consecutivePrimes.add(primeConsecutive-3);
					consecutivePrimes.add(primeConsecutive-2);
					consecutivePrimes.add(primeConsecutive -1);
					consecutivePrimes.add(primeConsecutive);
				}
			}
		}
		return consecutivePrimes;
	}
}

