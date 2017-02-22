package collatz;

import java.util.ArrayList;
import java.util.List;

public class CollatzSet {
	List<Long> collatzSize = new ArrayList<Long>();
	
	public List<Long> generateCollatz(long num){
		List<Long> collatz = new ArrayList<Long>();
		long nextNo = 0;
		while(nextNo!=1){
		if(num%2 == 0){
			nextNo = num/2;
		} else{
			nextNo = 3*num+1;
		}
		collatz.add(nextNo);
		num = nextNo;
		}
		return collatz;
		
	}

}

 




