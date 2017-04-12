package compare;

import java.util.ArrayList;
import java.util.List;

public class CompareWith {
	static List<Integer> list = new ArrayList<Integer>();

	public static List<Integer> NumbersList(){
		list.clear();
		for(int i = 1; i<10; i++){
			list.add(i);
		}
		return list;

	}

}
