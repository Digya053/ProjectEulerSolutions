package pandigital;

import java.util.List;

import utils.Maths;

import java.util.ArrayList;

public class PandigitalPrime {
	
	public List<Integer> findPandigitalPrimes(int n){
		List<Integer> pandigitalPrimes = new ArrayList<>();
		for(int i = 1; i< n; i++){
			if(Maths.isPrime(i)){
				if(Maths.isPandigital(i)){
					pandigitalPrimes.add(i);
				}
			}
		}
		return pandigitalPrimes;
	}

}
