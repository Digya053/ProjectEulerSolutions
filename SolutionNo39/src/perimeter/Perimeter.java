package perimeter;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.w3c.dom.Entity;

import utils.Maths;

import java.util.ArrayList;
import java.util.HashMap;

public class Perimeter {

	Map<Integer, Integer> perimetersCount = new HashMap<>();
	List<Integer> perimeterList = new ArrayList<>();

	public Map<Integer, Integer> findPerimetersCount(){
		int perimeter = 0;
		for(int a = 1; a <= 1000; a++){
			for(int b = 1; b <= 1000; b++){
				double c = Math.sqrt(a*a + b*b);
				if((c - (int)c) == 0){
					perimeter = a + b + (int)c;

					if(perimeter <= 1000){
						if(perimeterList.contains(perimeter)){
							perimetersCount.put(perimeter, perimetersCount.get(perimeter) + 1);
						} else{
							perimeterList.add(perimeter);
							perimetersCount.put(perimeter, 1);
						}
					}
				}
			}
		}
		return perimetersCount;
	}


	public int getMaximumPerimeter(Map<Integer, Integer> perimetersCount){
		int maximumPerimeter = 0;
		List<Integer> numbers = new ArrayList<>();

		for(Entry<Integer, Integer> entity : perimetersCount.entrySet()){
			numbers.add(entity.getValue());
		}

		int max = Maths.max(numbers);

		for(Entry<Integer, Integer> entity : perimetersCount.entrySet()){
			if(entity.getValue() == max){
				maximumPerimeter = entity.getKey();
			}
		}

		return maximumPerimeter;
	}
}




