package divisors;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PerfectDivisors {
	List<BigInteger> divisors = new ArrayList<BigInteger>();

	public List<BigInteger> find(int n){
		for(int i = 1; i<n; i++){
			if(n%i == 0){
				divisors.add(BigInteger.valueOf(i));
			}
			
		}
		return divisors;
	}
}