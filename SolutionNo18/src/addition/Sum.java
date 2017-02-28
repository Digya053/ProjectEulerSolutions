package addition;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Sum {
	//BigInteger sum = BigInteger.ZERO;

	public List<Integer> lastLineSum(String lastLine, String secondLastLine){
		List<Integer> lastLineNumbers = new ArrayList<Integer>();
		List<Integer> secondLastLineNumbers = new ArrayList<Integer>();
		List<Integer> sums = new ArrayList<Integer>();


		for(String splitted: lastLine.split("\\s+")){
			lastLineNumbers.add(Integer.parseInt(splitted));
		} 

		secondLastLine.replaceAll("[|]|\\s", "");
		for(String splitted : secondLastLine.split("\\s|,")){
			secondLastLineNumbers.add(Integer.parseInt(splitted));
		}
		int sum = 0;
		int x = 0;
		int size = secondLastLineNumbers.size();
		for(int i = 0; i<size;i++) {
			if(lastLineNumbers.get(i+1)>lastLineNumbers.get(i)){
				x = lastLineNumbers.get(i+1);
			} else {
				x = lastLineNumbers.get(i);
			}
			sum = x + secondLastLineNumbers.get(i);
			lastLineNumbers.set(i, sum);
		}
		lastLineNumbers.set(size, 0);
		return lastLineNumbers;
	}
}
