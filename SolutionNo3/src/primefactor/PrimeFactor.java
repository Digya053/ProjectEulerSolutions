package primefactor;

public class PrimeFactor {

	public boolean checkPrime(long n){
		if(n==2L){
			return true;
		}
		if(n%2L ==0){
			return false;
		}
		for(long i=3L;i<n;i+=2L){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}


