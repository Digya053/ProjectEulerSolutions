package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import collatz.CollatzSet;
import utils.Maths;

public class MainClass {
	public static void main(String[] args){
		CollatzSet collatzSet = new CollatzSet();
		List<Long> collatz = new ArrayList<Long>();

		Map<Long, Integer> collatzMap = new HashMap<Long, Integer>();
		for(long i = 1; i<1000000; i++){
			collatz = collatzSet.generateCollatz(i);
			collatzMap.put(i, collatz.size());

		}
		long maxNo = Maths.max(collatzMap);
		System.out.println("The no with maximum length of collatz is "+maxNo);



	}
}
