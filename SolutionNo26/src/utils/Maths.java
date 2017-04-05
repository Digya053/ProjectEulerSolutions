package utils;

import java.math.BigInteger;
import java.util.List;

public class Maths {
	static BigInteger maxNo = BigInteger.ZERO;

	public static BigInteger max(List<BigInteger> size){
		maxNo = size.get(0);
		for(int i = 1; i < size.size(); i++){
			if(size.get(i).compareTo(maxNo) == 1){
				maxNo = size.get(i);
			}
		}
		return maxNo;
	}
}
