package sum;

import java.util.ArrayList;
import java.util.List;

public class AddPrime {
	private List<Long> primeNo;
	long sum =0L;

	public AddPrime(){
		primeNo = new ArrayList<Long>();
	}

	public void checkPrime(long n){
		CheckPrime prime = new CheckPrime();
		primeNo.add(2L);
		for(long i =3L; i<n;i+=2L){
			boolean found = prime.check(i);
		
			if(found){
				primeNo.add(i);
			}
		}

		for (int i = 0; i<primeNo.size();i++){
			sum += primeNo.get(i);
		}

		System.out.println("The sum is "+sum);
	}
}

