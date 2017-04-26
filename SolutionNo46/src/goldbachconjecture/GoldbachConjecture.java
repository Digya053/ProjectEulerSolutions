package goldbachconjecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import math.Prime;

public class GoldbachConjecture {

	public List<Integer> generate(int n, List<Integer> compositeOdds){
		Collections.sort(compositeOdds);
		List<Integer> twoPrimeAddition = this.generateTwoPrimeAdditionList(n);
		Collections.sort(twoPrimeAddition);
		List<Integer> goldbachNumbers = new ArrayList<>();

		for(int i = 0; i < compositeOdds.size(); i++){
			int toCheck = compositeOdds.get(i);
			if(twoPrimeAddition.contains(toCheck)){
				goldbachNumbers.add(toCheck);
			}
		}
		Collections.sort(goldbachNumbers);
		return goldbachNumbers;

	}

	public List<Integer> generateTwoPrimeAdditionList(int n){
		Prime prime = new Prime();
		List<Integer> primes = prime.generate(n);
		List<Integer> twoPrimeAddition = new ArrayList<>();
		for(int i = 0; i < primes.size(); i++){
			int a = primes.get(i);
			for(int j = 0; j < primes.size(); j++){
				int b = j;
				int value = a + 2*b*b;
				twoPrimeAddition.add(value);
			}
		}
		return twoPrimeAddition;
	}

	public int getTheDifference(List<Integer> listOne, List<Integer> listTwo){
		int differentNumber = 0;
		for(int i = 0; i < listOne.size(); i++){
			if(!listTwo.contains(listOne.get(i))){
				differentNumber = listOne.get(i);
				break;
			}
		}
		return differentNumber;
	}

}
