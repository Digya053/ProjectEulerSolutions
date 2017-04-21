package pandigital;

import java.util.ArrayList;
import java.util.List;

import utils.Maths;

public class Pandigital {

	public void getPandigitalNumbers(int n){
		List<Integer> pandigitalPrimeNumbers = new ArrayList<>();

		for(int i = 1; i<n; i++){
			String number = null;
			for(int j = 1; j<n; j++){
				//if(i!= j){
					if(number == null){
						number = String.valueOf(i);
						System.out.println("firstNumber is " + number);
					} else {
						number = number.concat(String.valueOf(j));
						System.out.println("concatenated numbers are " + number);
					}
					if(Maths.isPrime(Integer.parseInt(number))){
						pandigitalPrimeNumbers.add(Integer.parseInt(number));
					}
				}
			}
		//}
		System.out.println(pandigitalPrimeNumbers);

	}

}
