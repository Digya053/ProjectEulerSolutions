package utils;

import java.util.ArrayList;
import java.util.List;

public class Maths {

	public static List<Integer> factor(int n){
		List<Integer> factors = new ArrayList<Integer>();
		for(int i = 1; i<n; i++){
			if(n%i == 0){
				factors.add(i);
			}
		}
		return factors;
	}

	public static int sum(List<Integer> factors){
		int sum = 0;
		for(int i = 0; i<factors.size(); i++){
			sum += factors.get(i);
		}
		return sum;
	}
}
