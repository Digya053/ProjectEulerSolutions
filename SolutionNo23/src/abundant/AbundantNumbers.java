package abundant;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import divisors.PerfectDivisors;
import java.util.HashSet;

public class AbundantNumbers {
	PerfectDivisors perfectDivisors = new PerfectDivisors();
	List<BigInteger> abundantNumbers = new ArrayList<BigInteger>();


	public List<BigInteger> find(){
		abundantNumbers.add(BigInteger.valueOf(12));
		for(int i = 13; i<28123 ; i++){
		
			List<BigInteger> divisor = new ArrayList<BigInteger>();
			divisor = perfectDivisors.find(i);
			BigInteger sum = BigInteger.ZERO;
			for(int j = 0; j<divisor.size(); j++){

				sum  = sum.add(divisor.get(j));
			}

			if(sum.compareTo(BigInteger.valueOf(i)) == 1){
				abundantNumbers.add(BigInteger.valueOf(i));
			}
			divisor.clear();
		}
		return abundantNumbers;
	}

	public Set<BigInteger> sumAbun(List<BigInteger> abundant){
		BigInteger sum = BigInteger.ZERO;
		List<BigInteger> sumOfAbundant = new ArrayList<BigInteger>();
		Set<BigInteger> newSumOfAbundant = new HashSet<BigInteger>(sumOfAbundant);
		for(int i = 0; i< abundant.size(); i++){ 
			for(int j = 0; j<abundant.size(); j++){
			sum = abundant.get(i).add(abundant.get(j));
			newSumOfAbundant.add(sum);
			sum = BigInteger.ZERO;
			}
		}
		return newSumOfAbundant;
	}	

	public BigInteger checkSumAvailable(){
		BigInteger sum = BigInteger.ZERO;
		List<BigInteger> abundant = this.find();
		Set<BigInteger> sumAbundant = this.sumAbun(abundant);
		for(int i = 0; i<28123; i++){
			BigInteger iBigInt = BigInteger.valueOf(i);
			boolean contains = sumAbundant.contains(iBigInt);
			if(!contains){
				sum = sum.add(iBigInt);
			}
		}
		return sum;
	}
}


