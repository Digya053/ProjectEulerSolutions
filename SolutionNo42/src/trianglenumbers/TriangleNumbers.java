package trianglenumbers;

import java.util.List;
import java.util.ArrayList;

public class TriangleNumbers {
	
	public boolean check(int n){
		if(this.getTriangleNumbers(n).contains(n)){
			return true;
		}
		return false;
		
	}
	
	public List<Integer> getTriangleNumbers(int n){
		List<Integer> triangleNumbers = new ArrayList<>();
		int numbers = 0;
		for(int i = 1; i <= 1000; i++){
			numbers = i*(i+1)/2;
			triangleNumbers.add(numbers);
		}
			return triangleNumbers;
		}

}
