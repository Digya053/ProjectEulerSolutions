package math;

import java.util.ArrayList;
import java.util.List;

public class CompositeOdd {

	public List<Integer> generate(int n){
		Prime prime = new Prime();
		List<Integer> compositeOdds = new ArrayList<>();
		for(int i = 1; i <= n; i+=2){
			if(!prime.isPrime(i)){
				compositeOdds.add(i);
			}
		}
		return compositeOdds;
	}



}
