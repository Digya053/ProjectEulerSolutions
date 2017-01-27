package sum;

public class CheckPrime {
	
	public boolean check(long n){
		boolean checkStatus = true;
		
		if(n==2){
			return true;
		}
		if(n%2 ==0){
			return false;
		}
		for(long i=3; i<n; i+=2){
			
				if(n%i == 0){
					return false;
				}
			}

		return checkStatus;
	}

}
