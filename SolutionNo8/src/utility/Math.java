package utility;

import java.util.List;

public class Math {
	private static long max=0;
	public static long max(List<Long> num){
		for(int i=0; i<num.size();i++){
			if(max<num.get(i)){
				max = num.get(i);
			}
		}
		return max;
		
	}

}
