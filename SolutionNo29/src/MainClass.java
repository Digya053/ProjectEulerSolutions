import java.util.List;

public class MainClass {
	
	public static void main(String[] args){
		Terms terms = new Terms();
		List<Double> numbers = terms.getTerms();
		System.out.println("The number of distinct terms are " + numbers.size());
		
	}

}
