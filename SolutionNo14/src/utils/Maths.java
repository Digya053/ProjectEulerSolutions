package utils;

import java.util.List;
import java.util.Map;

public class Maths {
	public static long max(List<Long> collatzSize){
		long max = 0;
		for(int i =1;i<collatzSize.size();i++){
			if(collatzSize.get(i)>max){
				max = collatzSize.get(i);
			}
		}
		return max;
	}

	public static long max(Map<Long, Integer> collatzMap){
		long no = 0;
		long max = 0;
		for(Long key : collatzMap.keySet()){
			Integer value = collatzMap.get(key);
			if(value > max){
				max = value;
				no = key;
			}

		}
		return no;
	}

}
