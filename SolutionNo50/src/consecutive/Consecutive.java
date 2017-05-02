package consecutive;

import java.util.List;

import utils.Maths;

public class Consecutive {
	
	public int generateMaximumConsecutive(int n){
		List<Integer> primeNumbers = Maths.generatePrimeNumbers(n);
		int maxSum = 0;
		int maxRun = -1;
		for(int i = 0; i < primeNumbers.size(); i++){
			int sum = 0;
			for(int j = i; j < primeNumbers.size(); j++){
				sum += primeNumbers.get(j);
				if(sum > n){
					break;
				} else if(j-i > maxRun && sum > maxSum && Maths.isPrime(sum)){
					maxSum = sum;
					maxRun = j - i;
				}
			}
		}
		return maxSum;
	}

}
