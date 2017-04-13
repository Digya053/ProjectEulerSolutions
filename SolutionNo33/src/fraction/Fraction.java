package fraction;

import java.util.ArrayList;
import java.util.List;

import utils.Compare;
import utils.Maths;

public class Fraction {

	public void generateFraction(){
		Maths maths = new Maths();
		List<Integer> denominatorList = new ArrayList<>();
		double fractionDivision = 0;
		double differentDigitFractionDivision = 0;
		for(double numerator = 10; numerator <= 12; numerator++){
			//for(double denominator = 10; denominator <= 12; denominator++){
				//fractionDivision = numerator/denominator;
				//System.out.println("numerator is " + numerator + "  " + "denominator is " +  denominator + " " + "fractionDivision is " +  fractionDivision);
				List<Integer> numeratorDigits = maths.convertNumberToDigit(numerator);
				System.out.println("numeratorDigits is " + numeratorDigits);
				//List<Integer> denominatorDigits = Maths.convertNumberToDigit(denominator);
				//System.out.println("denominator digits is " + denominatorDigits);


			/*	if(Compare.Lists(numeratorDigits, denominatorDigits)){
					double numeratorDifferentDigit = numeratorDigits.get(1);
					double denominatorDifferentDigit = denominatorDigits.get(1);
					System.out.println("numeratorDifferentDigit is " + numeratorDifferentDigit);
					System.out.println("denominatorDifferentdigit is " + denominatorDifferentDigit);
					differentDigitFractionDivision = numeratorDifferentDigit/ denominatorDifferentDigit;
					System.out.println("fractionDivision is " + fractionDivision + "    " + "differentDigitFractionDivision is " + differentDigitFractionDivision);
					if(Compare.division(fractionDivision, differentDigitFractionDivision) == true){
						denominatorList.add((int)denominator);
						//System.out.println("denominator " + denominator + "numerator " + numerator + 
								//"denominatorList " + denominatorList);
					}*/
					//System.out.println("======================================================");
					//System.out.println(numeratorDifferentDigit + " " + denominatorDifferentDigit + " " + " " +differentDigitFractionDivision);
				}




			}
		}
		//System.out.println(denominatorList);
	//}

//}
