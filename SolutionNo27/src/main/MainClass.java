package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import quadratic.QuadraticNumber;
import utils.Maths;

public class MainClass {
	
	public static void main(String[] args){
		
		QuadraticNumber quadratic = new QuadraticNumber();
		List<Integer> n = new ArrayList<Integer>();
		Map<Integer, Integer> nValues = quadratic.findPrime();
		
		for(int nValue : nValues.keySet()){
			n.add(nValue);
		}
		int maximum = Maths.max(n);
		System.out.println("The maximum value of n is " + maximum);
		System.out.println("The product of a and b is " + nValues.get(maximum));
	}

}
