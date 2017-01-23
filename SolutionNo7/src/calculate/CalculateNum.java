package calculate;

import java.util.ArrayList;
import java.util.List;

public class CalculateNum {
	private List<Long> primes;

	public CalculateNum(){
		primes = new ArrayList<Long>();
		primes.add(2L);
	}

	public void calculatePrime(long n, int position){
		for(int i=3; i<n;i+=2){
			boolean number = true;
			for(int j =3; j<i; j++){
				if(i%j==0){
					number =false;
					break;
				}

			}

			if(number == true){
				primes.add((long)i);
			}
		}
		System.out.println("All the prime numbers upto the position are "+primes.toString());
		System.out.println("The prime no at position given is " + primes.get(position-1));

	}

}




