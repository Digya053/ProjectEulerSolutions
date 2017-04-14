package fraction;

import java.util.ArrayList;
import java.util.List;

import utils.Compare;
import utils.Maths;

public class Fraction {

	public int generateFractionAndGetLcm(){
		float dividedFirstValue = 0f;
		float newNumerator = 0f;
		float newDenominator = 0f;
		float dividedSecondValue = 0f;
		int lcm = 0;
		List<Float> expected = new ArrayList<>();
		List<Float> numeratorList = new ArrayList<>();
		List<Float> denominatorList = new ArrayList<>();
		for(int numerator = 10; numerator < 100 ; numerator++){
			for(int denominator = 10; denominator < 100; denominator++){
				expected.clear();

				if(numerator % 10 == 0 || denominator % 10 == 0 || numerator == denominator){
					continue;
				}

				List<Integer> numeratorDigits = Maths.convertNumberToDigit(numerator);
				List<Integer> denominatorDigits = Maths.convertNumberToDigit(denominator);

				if(Compare.lists(numeratorDigits, denominatorDigits) != null){
					dividedFirstValue = (float) numerator / (float) denominator;
					expected.add(dividedFirstValue);

					if(Compare.lists(numeratorDigits, denominatorDigits).equals("FirstDigitEqual")){
						newNumerator = (float) numeratorDigits.get(1);
						newDenominator = (float) denominatorDigits.get(1);

					} else if(Compare.lists(numeratorDigits, denominatorDigits).equals("SecondDigitEqual")){
						newNumerator = (float) numeratorDigits.get(0);
						newDenominator = (float) numeratorDigits.get(0);
					} else if(Compare.lists(numeratorDigits, denominatorDigits).equals("SecondAndFirstDigitEqual")){
						newNumerator = (float) numeratorDigits.get(0);
						newDenominator = (float) denominatorDigits.get(1);
					} else if(Compare.lists(numeratorDigits, denominatorDigits).equals("FirstAndSecondDigitEqual")){
						newNumerator = (float) numeratorDigits.get(1);
						newDenominator = (float) denominatorDigits.get(0);
					}
					dividedSecondValue = newNumerator/newDenominator;

					if ((expected.contains(dividedSecondValue)) && 
							(Float.compare(dividedFirstValue, dividedSecondValue) == 0)
							&& (dividedSecondValue < 1)){
						if(denominatorList.contains((float) denominator) == false){
							denominatorList.add((float) denominator);
							numeratorList.add((float) numerator);
						}
					}
				}

				int numeratorProduct = Maths.product(numeratorList);
				int denominatorProduct = Maths.product(denominatorList);

				int gcf = Maths.gcf(numeratorProduct, denominatorProduct);

				lcm = denominatorProduct / gcf;

			}
		}
		System.out.println("Numerator list is " + numeratorList);
		System.out.println("Denominator list is " + denominatorList);
		return lcm;
	}
}


