package calculate;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FindDigits {
	private static List<BigInteger> no;
	public static List<BigInteger> getDigits(String num, int digitsNo){
		no = new ArrayList<BigInteger>();
		int count = 0;
		int fifty = digitsNo;
		for(int i = 0; i<num.length(); i++){
		    BigInteger digits = new BigInteger(num.substring(count, fifty));
		    no.add(digits);
	        count = fifty;
	        fifty+= digitsNo;
	        if(count == 5000){
	        	break;
	        }
		}
		return no;
	}
}



