package pandigital;

import java.util.ArrayList;
import java.util.List;

import utils.Maths;

public class PandigitalNumbers {

	public String actualPandigital(){
		return "123456789";
	}

	public List<String> multiplyAndConcatenate(int n){

		List<Integer> pandigital = new ArrayList<>();
		List<String> sortedNumberList = new ArrayList<>();

		for(int i = 1; i < n; i++){

			int product = 0;
			String numCount = null;
			String productString = null;
			String sortedNumber = null;

			for(int j = 1; j < n; j++){
				product = i*j;

				if(product == i){
					numCount = String.valueOf(product);
					sortedNumber = Maths.sortString(numCount);
				} else {
					productString = String.valueOf(product);
					numCount = numCount.concat(productString);
					sortedNumber = Maths.sortString(numCount);
				}

				int count = sortedNumber.length();

				if(sortedNumber.equals(this.actualPandigital())){
					pandigital.add(i);
					sortedNumberList.add(numCount);
				}

				if(count >= 9){
					break;
				}

			}
		}

		return sortedNumberList;
	}

}
