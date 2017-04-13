package fraction;

import java.util.ArrayList;
import java.util.List;

import utils.Compare;
import utils.Maths;

public class Fraction {

	public void getFraction(){
		double newNumerator = 0;
		double newDenominator = 0;
		double dividedFirstValue = 0;
		double dividedSecondValue = 0;
		//double EPSILON = 0.00001;
		List<Integer> denominatorList = new ArrayList<>();
		for(int numerator = 10; numerator <= 20; numerator++){
			for(int denominator = 10; denominator <= 20; denominator++){
				List<Integer> numeratorDigits = null;
				List<Integer> denominatorDigits = null;
				dividedFirstValue = (double)numerator/ (double)denominator;
				numeratorDigits = Maths.getDigitsFromNumber(numerator);
				System.out.println("numDigits are " + numeratorDigits);
				denominatorDigits = Maths.getDigitsFromNumber(denominator);
				System.out.println("denominator digits are " + denominatorDigits);

				System.out.println("comparision is " + Compare.lists(numeratorDigits, denominatorDigits));
				if(!Compare.lists(numeratorDigits, denominatorDigits).equals(null)){
					if(Compare.lists(numeratorDigits, denominatorDigits).equals("FirstDigitEqual")){
						newNumerator = (double) numeratorDigits.get(1);
						newDenominator = (double) denominatorDigits.get(1);
						dividedSecondValue = newNumerator/newDenominator;

					} else if(Compare.lists(numeratorDigits, denominatorDigits).equals("SecondDigitEqual")){
						newNumerator = (double) numeratorDigits.get(0);
						newDenominator = (double) numeratorDigits.get(0);
						dividedSecondValue = newNumerator/newDenominator;
					}
					System.out.println("newNumerator is " + newNumerator);
					System.out.println("newDenominator is " + newDenominator);
					
					System.out.println("dividedFirstValue is " + dividedFirstValue);
					System.out.println("dividedSecondValue is " + dividedSecondValue);
				}
				/*if(dividedFirstValue == dividedSecondValue){
					denominatorList.add(denominator);
				}*/
				else{
				dividedSecondValue = 0;
				}
				if(Double.compare(dividedFirstValue, dividedSecondValue) == 0){
					System.out.println("inside if dividedFirstValue " + dividedFirstValue);
					System.out.println("inside if dividedSecondValue " + dividedSecondValue);
					denominatorList.add(denominator);
				}

				/*if (Math.abs(dividedFirstValue - dividedSecondValue) < EPSILON){
					denominatorList.add(denominator);
				}*/
			}
		}
		System.out.println("denominator list is " + denominatorList);

	}

}
