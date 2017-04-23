package pentagon;

import java.util.ArrayList;
import java.util.List;

public class PentagonalNumbers {
	List<Integer> pentagonalNumbers = new ArrayList<>();

	public List<Integer> getPentagonalNumbers(int n){
		pentagonalNumbers.clear();
		int numbers;
		for(int i = 1; i<n; i++){
			numbers = i * (3*i -1)/2;
			pentagonalNumbers.add(numbers);

		}
		return pentagonalNumbers;
	}

	public boolean sumPentagonalNumbers(int a, int b){
		int sum = 0;
		sum = a + b;
		if(pentagonalNumbers.contains(sum)){
			return true;
		} else {
			return false;
		}

	}

	public boolean differencePentagonalNumbers(int a, int b){
		int difference = 0;
		difference = a - b;
		if(pentagonalNumbers.contains(difference)){
			return true;
		} else {
			return false;
		}
	}


	public List<Integer> findDifference(){
		List<Integer> differenceBetweenNumbers = new ArrayList<>();
		int difference;
		for(int i = 0; i < pentagonalNumbers.size(); i++){
			for(int j = 0; j < pentagonalNumbers.size(); j++){
				if(i != j){
					if(sumPentagonalNumbers(pentagonalNumbers.get(i), pentagonalNumbers.get(j))){
						if(differencePentagonalNumbers(pentagonalNumbers.get(i),pentagonalNumbers.get(j))){
							difference = Math.abs(pentagonalNumbers.get(i) -pentagonalNumbers.get(j));
							if(!differenceBetweenNumbers.contains(difference)){
								differenceBetweenNumbers.add(difference);
								break;
							}
						}
					}
				}
			}
		}
		return differenceBetweenNumbers;
	}



}
