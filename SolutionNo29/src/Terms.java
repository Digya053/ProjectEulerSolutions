import java.util.ArrayList;
import java.util.List;

public class Terms {
	List<Double> numbers = new ArrayList<Double>();

	public List<Double> getTerms(){
		for(int a = 2 ; a <= 100; a++){
			for(int b = 2; b <= 100; b++){
				double number = Math.pow(a, b);
				if(!numbers.contains(number)){
					numbers.add(number);
				}
			}
		}
		return numbers;
	}
}
