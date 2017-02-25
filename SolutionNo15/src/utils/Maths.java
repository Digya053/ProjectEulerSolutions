package utils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Maths {

	public static List<Integer> getFactor(int n){
		List<Integer> factor = new ArrayList<Integer>();
		for(int i = 1; i<=n; i++){
			factor.add(i);
		}
		return factor;
	}
	
	public static BigInteger getFactorial(List<Integer> factor){
		BigInteger factorial = BigInteger.ONE;
		BigInteger multiply = BigInteger.ONE;
		for(int i = 0; i<factor.size(); i++){
			multiply = factorial.multiply(BigInteger.valueOf(factor.get(i)));
			factorial = multiply;
		}
			return factorial;
		}
		
	public static BigInteger getNoOfPaths(int n, int m){
		int p = n+m;
		List<Integer> factorN = Maths.getFactor(n);
		List<Integer> factorM= Maths.getFactor(m);
		List<Integer> factorP = Maths.getFactor(p);
		
		BigInteger factorialN = Maths.getFactorial(factorN);
		BigInteger factorialM = Maths.getFactorial(factorM);
		BigInteger factorialP = Maths.getFactorial(factorP);
		
		BigInteger combinationNum = factorialP;
		BigInteger combinationDen = factorialN.multiply(factorialM);
		
	    BigInteger combination = combinationNum.divide(combinationDen);
	
		return combination;
	}
}

