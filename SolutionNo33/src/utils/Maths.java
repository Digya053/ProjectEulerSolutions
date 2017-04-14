package utils;

import java.util.ArrayList;
import java.util.List;

public class Maths {

	public static List<Integer> convertNumberToDigit(int number){
		List<Integer> digits = new ArrayList<>();
		while(number > 0){
			int digit = number % 10;
			digits.add(digit);
			number /= 10;
		}
		return digits;
	}

	public static int gcf(int x, int y){
		if(y == 0){
			return x;
		} else {
			return gcf(y, x%y);

		}
	}

	public static int lcm(List<Float> numbers){
		int lcm = 0;
		int gcf = 0;
		int x = Math.round(numbers.get(0));
		for(int i = 0; i<numbers.size()-1; i++){
			int y = Math.round(numbers.get(i+1));
			gcf = gcf(x,y);
			lcm = Math.abs(x * y)/gcf;
			x = lcm;
		}
		return lcm;
	}

	public static int product(List<Float> numbers){
		int product = 1;
		for(int i = 0; i < numbers.size(); i++){
			product *= numbers.get(i);
		}
		return product;
	}

}
