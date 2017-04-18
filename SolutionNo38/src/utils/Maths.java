package utils;

import java.util.Arrays;
import java.util.List;

public class Maths {

	public static String sortString(String number){
		char[] numberInChar = number.toCharArray();
		Arrays.sort(numberInChar);
		String sortedNumber = new String(numberInChar);
		return sortedNumber;

	}

	public static int max(List<String> numbers){
		int max = Integer.parseInt(numbers.get(0));

		for(int i = 1; i<numbers.size(); i++){
			if(max < Integer.parseInt(numbers.get(i))){
				max = Integer.parseInt(numbers.get(i));
			}
		}
		
		return max;

	}

}
