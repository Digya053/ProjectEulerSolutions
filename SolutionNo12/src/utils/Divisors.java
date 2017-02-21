package utils;

import java.util.ArrayList;
import java.util.List;

public class Divisors {
	private static int i = 1;
	
	public static List<Integer> findDivisors(int n){
		List<Integer> divs = new ArrayList<Integer>();
		for(i =1; i<= n; i++){
			if(n%i == 0){
				divs.add(i);
			}
		}
		return divs;
	}

}
