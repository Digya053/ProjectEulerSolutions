package quadratic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import prime.Number;

public class QuadraticNumber {

	public Map<Integer, Integer> findPrime(){
		Map<Integer, Integer> noAndProduct = new HashMap<Integer, Integer>();
		List<Integer> nValues = new ArrayList<Integer>();
		for(int a = -1000; a <1000; a++){
			for(int b = -1000; b <=1000; b++){
				int n = 0;
				while(Number.isPrime(n*n + a * n + b)){
					nValues.add(n);
					noAndProduct.put(n, a*b);
					n++;
				}
			}

		}
		return noAndProduct;
	}
}
