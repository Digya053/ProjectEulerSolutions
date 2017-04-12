package sum;

import java.math.BigInteger;
import java.util.List;

public class Sum {
	
	static BigInteger sum = BigInteger.ZERO;
	
	public static BigInteger findSum(List<BigInteger> numbers){
		for(int i = 0; i < numbers.size(); i++){
			sum = sum.add(numbers.get(i));
		}
		return sum;
	}
}
