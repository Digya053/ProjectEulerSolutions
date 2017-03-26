package fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
	List<BigInteger> fibonacciNo = new ArrayList<BigInteger>();

	public List<BigInteger> generate(BigInteger n){
		BigInteger num = BigInteger.ZERO;
		fibonacciNo.add(BigInteger.valueOf(0));
		fibonacciNo.add(BigInteger.valueOf(1));
		fibonacciNo.add(BigInteger.valueOf(1));
		for(int i = 1; i<n.intValue() ; i++){
			num = fibonacciNo.get(i).add(fibonacciNo.get(i+1));
			fibonacciNo.add(num);
		}
		return fibonacciNo;
	}

	public int findNo(List<BigInteger> fibonacciNo){
		int i = 0;
		for(i = 0; i<fibonacciNo.size(); i++){
			int size = String.valueOf(fibonacciNo.get(i)).length();
			if(size == 1000){
				break;
			}
		}
		return i;
	}



}
