package numbers;

import java.util.List;
import java.util.ArrayList;

public class Numbers {
	
	List<Long> triangleNumbers = new ArrayList<>();
	List<Long> pentagonalNumbers = new ArrayList<>();
	List<Long> hexagonalNumbers = new ArrayList<>();

	
	public List<Long> getTriangleNumbers(long n){
		triangleNumbers.clear();
		long numbers;
		for(long i = 1L; i < n ; i++){
			numbers = i*(i+1)/2;
			triangleNumbers.add(numbers);
		}
		return triangleNumbers;
	}
	

	public List<Long> getPentagonalNumbers(long n){
		pentagonalNumbers.clear();
		long numbers;
		for(long i = 1L; i < n; i++){
			numbers = i*(3*i-1)/2;
			pentagonalNumbers.add(numbers);
		}
		return pentagonalNumbers;
	}
	

	public List<Long> getHexagonalNumbers(long n){
		hexagonalNumbers.clear();
		long numbers;
		for(long i = 1L; i < n; i++){
			numbers = i*(2*i-1);
			hexagonalNumbers.add(numbers);
		}
		return hexagonalNumbers;
	}
	

	public boolean isTriangleNumber(long number){
		if(triangleNumbers.contains(number)){
			return true;
		} 
		return false;
	}
	

	public boolean isPentagonalNumber(long number){
		if(pentagonalNumbers.contains(number)){
			return true;
		}
		return false;
	}
	

	public boolean isHexagonalNumber(long number){
		if(hexagonalNumbers.contains(number)){
			return true;
		}
		return false;
	}
	
	
	public List<String> getTrianglePentagonalHexagonalNumbers(long n){
		this.getTriangleNumbers(n);
		this.getPentagonalNumbers(n);
		this.getHexagonalNumbers(n);
		List<String> trianglePentagonalHexagonalNumbers = new ArrayList<>();
		for(long i = 1L; i < n; i++){
			if(isTriangleNumber(i)){
				if(isPentagonalNumber(i)){
					if(isHexagonalNumber(i)){
						trianglePentagonalHexagonalNumbers.add(String.valueOf(i));
						if(i > 40755L){
							break;
						}
					}
				}
			}
		}
		return trianglePentagonalHexagonalNumbers;
	}

}
