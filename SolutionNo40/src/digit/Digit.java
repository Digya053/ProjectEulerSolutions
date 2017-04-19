package digit;

import utils.Maths;

public class Digit {

	public String getDigit(){
		String allDigits = "0.1";
		for(int i = 2; i<555555; i++){
			allDigits = allDigits.concat(String.valueOf(i));
			if(allDigits.length() > 1000002){
				break;
			}
		}
		return allDigits;
	}

	public int multiplyNthDigit(){
		String allDigits = this.getDigit();
		String afterDecimal = Maths.getAfterDecimal(allDigits);
		int firstDigit = Character.getNumericValue(afterDecimal.charAt(0));
		int tenthDigit = Character.getNumericValue(afterDecimal.charAt(9));
		int hundredthDigit = Character.getNumericValue(afterDecimal.charAt(99));
		int thousandthDigit = Character.getNumericValue(afterDecimal.charAt(999));
		int tenThousandthDigit = Character.getNumericValue(afterDecimal.charAt(9999));
		int hundredThousandthDigit = Character.getNumericValue(afterDecimal.charAt(99999));
		int millionthDigit = Character.getNumericValue(afterDecimal.charAt(999999));

		int expression = firstDigit * tenthDigit * hundredthDigit * thousandthDigit * tenThousandthDigit *
				hundredThousandthDigit * millionthDigit;

		return expression;
	}

}
