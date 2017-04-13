package utils;

import java.util.List;

public class Compare {
	
	public static String lists(List<Integer> firstList, List<Integer> secondList){
		System.out.println("Numerator list in another class is" + firstList);
		System.out.println("denominator list in another class is " + secondList);
		System.out.println("firstList firstDigit is " + firstList.get(0) );
		System.out.println("seconList firstDigit is " + secondList.get(0));
		System.out.println("firstList secondDigit is " + firstList.get(1));
		System.out.println("secondList secondDigit is " + secondList.get(1));
	
		if(firstList.get(0).equals(secondList.get(0))){
			return "FirstDigitEqual";
		}
		else if(firstList.get(1).equals(secondList.get(1))){
			return "SecondDigitEqual";
		}
		return null;
	}

}
