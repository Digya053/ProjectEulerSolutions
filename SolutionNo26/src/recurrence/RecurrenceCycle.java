package recurrence;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class RecurrenceCycle {

	List<BigInteger> remainders = new ArrayList<BigInteger>();

	public BigInteger find(int i){
		BigInteger numerator = BigInteger.ONE;
		BigInteger temp = BigInteger.ZERO;
		BigInteger remainder = BigInteger.ZERO;
		BigInteger size = BigInteger.ZERO;
		remainders.clear();
		BigInteger denominator = BigInteger.valueOf(i);
		remainder = numerator.mod(denominator);
		temp = remainder; 
		remainder = BigInteger.ONE;
		boolean found = true;

		while(found){
			if(!remainders.contains(remainder) && !remainder.equals(BigInteger.valueOf(0))){
				remainders.add(remainder);
				numerator = temp.multiply(BigInteger.valueOf(10));
				remainder = numerator.mod(denominator);
				temp = remainder;

			} else {
				found = false;
				size = BigInteger.valueOf(remainders.size());
			}
		}
		return size;
	}
}
