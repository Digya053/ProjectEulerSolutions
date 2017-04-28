package utils;

<<<<<<< HEAD
import java.util.Arrays;
import java.util.List;

public class Maths {

	public static boolean isPrime(int n){
		if(n == 2){
			return true;
		}

		if(n == 1 || n % 2 == 0){
			return false;
		}

		for(int i = 3; 2*i<n ; i++){

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


	public static String[] getPandigitalNumbers(){

		String[] pandigitalNumbers = new String[]{
			"1",
			"12", 
			"123",
			"1234",
			"12345",
			"123456",
			"1234567",
			"12345678",
			"123456789"
		};
		return pandigitalNumbers;
	}

	public static String sortString (int n){
		String number = Integer.toString(n);
		char[] c = number.toCharArray();
		Arrays.sort(c);
		String sortedNumber = new String(c);
		return sortedNumber;

	}

	public static boolean isPandigital(int n){
		String sortedNumber = sortString(n);
		String[] pandigitalNumbers = getPandigitalNumbers();
		
		if(Arrays.asList(pandigitalNumbers).contains(sortedNumber)){
			return true;
		}
		return false;
	}
	
	public static int max(List<Integer> pandigitalPrimes){
		 int max = pandigitalPrimes.get(0);
		 for(int i = 1; i < pandigitalPrimes.size(); i++){
			 if(max < pandigitalPrimes.get(i)){
				 max = pandigitalPrimes.get(i);
			 }
		 }
		 return max;
	}


}
}

