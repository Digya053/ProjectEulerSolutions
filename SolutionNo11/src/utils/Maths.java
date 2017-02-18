package utils;

import java.util.List;

public class Maths {
	public static int max(List<Integer> nums){
		int max = 0;
		for(int i = 0; i< nums.size(); i++){
			if(nums.get(i) > max){
				max = nums.get(i);
			}
		}
		return max;
	}

}