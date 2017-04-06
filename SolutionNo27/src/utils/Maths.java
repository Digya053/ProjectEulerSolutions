package utils;

import java.util.List;

public class Maths {
	
	public static int max(List<Integer> numbers){
		int max = numbers.get(0);
		for(int i = 1; i<numbers.size(); i++){
			if(max < numbers.get(i)){
				max = numbers.get(i);
			}
		}
		return max;
		
	}

}
