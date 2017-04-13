package utils;

import java.util.Collections;
import java.util.List;

public class Compare {

	public static boolean Lists(List<Integer> firstList, List<Integer> secondList){
		Collections.sort(firstList);
		Collections.sort(secondList);
		if(firstList.equals(secondList)){
			return true;
		}
		return false;
	}

	public static boolean division(double firstDivision, double secondDivision){
		if(firstDivision == secondDivision){
			return true;
		}
		return false;
	}

}
