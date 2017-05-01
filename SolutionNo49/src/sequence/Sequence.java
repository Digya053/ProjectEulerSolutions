package sequence;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import utils.Maths;

public class Sequence {

	public List<Integer> generateSequence(){
		List<Integer> sequence = new ArrayList<>();
		List<Integer> permutationsInInt;
		
		for(int i = 1488; i <= 9999; i++){
			
			if(Maths.isPrime(i)){
				int secondTerm = i + 3330;
				int thirdTerm = secondTerm + 3330;
				
				if(Maths.isPrime(secondTerm) && Maths.isPrime(thirdTerm)){
					List<Object> permutations = Maths.generatePermutation(4, Maths.convertObjectToArray(i));
					permutationsInInt = new ArrayList<>();
					int number = 0;

					for(int j = 0; j < permutations.size(); j++){
						String temp = permutations.get(j).toString();

						temp = temp.replaceAll("[^0-9]+", "");
						number = Integer.parseInt(temp);
						permutationsInInt.add(number);
					}
					
					if(permutationsInInt.contains(secondTerm) && permutationsInInt.contains(thirdTerm)){
						sequence.add(i);
						sequence.add(secondTerm);
						sequence.add(thirdTerm);
						break;
					}
				}

			}
		}
		return sequence;

	}
}
