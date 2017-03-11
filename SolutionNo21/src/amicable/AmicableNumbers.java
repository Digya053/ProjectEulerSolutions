package amicable;

import java.util.ArrayList;
import java.util.List;
import utils.Maths;

public class AmicableNumbers {
	List<Integer> amicableNumbers = new ArrayList<Integer>();

	public List<Integer> find(int n){
		for(int i = 2; i<n ; i++){
			List<Integer> factors = Maths.factor(i);
			int sum = Maths.sum(factors);
			List<Integer> sumFactors = Maths.factor(sum);
			int sumSumFactors = Maths.sum(sumFactors);
			if(i!=sum){
				if (i == sumSumFactors){
					amicableNumbers.add(i);
				}
			}
		}
		return amicableNumbers;
	}
}
