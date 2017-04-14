package curiousnumber;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import utils.Factorial;
import utils.Maths;

public class CuriousNumber {

	public List<Integer> generate(BigInteger n){
		List<Integer> curiousNumbers = new ArrayList<Integer>();
		BigInteger sum = BigInteger.ZERO;
		BigInteger factorial = BigInteger.ZERO;
		
		for(int i = 3; i<n.intValue(); i++){
			List<Integer> digits = Maths.getDigitsFromNumber(i);

			for(int j = 0; j < digits.size(); j++){
				factorial = Factorial.get(digits.get(j));
				sum = sum.add(factorial);

			}

			if(sum.equals(BigInteger.valueOf(i))){
				curiousNumbers.add(i);
			}
			sum = BigInteger.ZERO;
		}
		return curiousNumbers;
	}

}
