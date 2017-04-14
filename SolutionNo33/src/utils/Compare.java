package utils;

import java.util.List;

public class Compare {

	public static String lists(List<Integer> firstList, List<Integer> secondList){

		if(firstList.get(0).compareTo(secondList.get(0)) == 0){
			return "FirstDigitEqual";
		}
		else if(firstList.get(1).compareTo(secondList.get(1)) == 0){
			return "SecondDigitEqual";
		}
		else if(firstList.get(1).compareTo(secondList.get(0)) == 0){
			return "SecondAndFirstDigitEqual";
		}
		else if(firstList.get(0).compareTo(secondList.get(1)) == 0){
			return "FirstAndSecondDigitEqual";
		}
		return null;
	}

}
