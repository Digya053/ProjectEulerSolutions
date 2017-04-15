package circularprimes;

import java.util.ArrayList;
import java.util.List;

import utils.Maths;

public class CircularPrime {

	public List<Integer> find(int n){
		boolean prime;
		List<Integer> circularPrimes = new ArrayList<>();
		for(int i = 2; i < n; i++){
			int count = 0;
			String number = String.valueOf(i);
			int newNumber = i;
			for(int j = 0; j < number.length(); j++){
				prime = Maths.isPrime(newNumber);
				if(prime){
					count++;
					newNumber = Maths.rotate(newNumber);
				}
				else{
					break;
				}

				if(count == number.length()){
					circularPrimes.add(i);
				}
			}
		}
		return circularPrimes;
	}

	public int count(List<Integer> circularPrimes){
		int count = circularPrimes.size();
		return count;

	}
}

