package pandigital;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import compare.CompareWith;
import utils.Maths;

public class Pandigital {
	BigInteger multiply = BigInteger.ZERO;
	List<Integer> digitsFromList = new ArrayList<Integer>();
	List<BigInteger> pandigital = new ArrayList<BigInteger>();

	public List<BigInteger> findPandigital(){
		for(int i = 1 ; i < 300; i++){
			for(int j = 1; j < 2000; j++){
				multiply = BigInteger.valueOf(i).multiply(BigInteger.valueOf(j));
				digitsFromList = Maths.breakNumberToDigitAndList(multiply,BigInteger.valueOf(i),
						BigInteger.valueOf(j));
				Collections.sort(digitsFromList);
				Collections.sort(CompareWith.NumbersList());
				if(CompareWith.NumbersList().equals(digitsFromList) && 
						CompareWith.NumbersList().size() ==(digitsFromList.size())){
					if(!pandigital.contains(multiply)){
						pandigital.add(multiply);
					}
				}
			}
		}
		return pandigital;
	}

}
