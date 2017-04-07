package spiral;

import java.math.BigInteger;

public class UlamSpiral {
	
	public BigInteger function(int n){
		BigInteger result = BigInteger.ZERO;
		if(n == 0){
			result = BigInteger.valueOf(1);
		}
		else{
			BigInteger firstTerm = BigInteger.valueOf(4).multiply(BigInteger.valueOf(2*n+1).pow(2));
			BigInteger secondTerm = BigInteger.valueOf(12 * n);
			result = firstTerm.subtract(secondTerm).add(function(n-1));
		}
		return result;
		
	}

}
