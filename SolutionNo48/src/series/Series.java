package series;

import java.math.BigInteger;

public class Series {
	
	public BigInteger solve(int n){
		BigInteger sum = BigInteger.ZERO;
		for(int i = 1; i <= n; i++){
			sum = sum.add(BigInteger.valueOf(i).pow(i));
		}
		return sum;
	}
	
	public String getLastTenDigits(BigInteger sum){
		String sumInString = sum.toString();
		String tenDigits = sumInString.substring(sumInString.length()-10);
		return tenDigits;
	}

}
