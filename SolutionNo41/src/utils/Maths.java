package utils;

public class Maths {

	public static boolean isPrime(int n){
		
		if(n == 2){
			return true;
			
		} else if(n % 2 == 0 || n == 1){
			return false;
		}

		for(int i = 3; i<n ; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
}

