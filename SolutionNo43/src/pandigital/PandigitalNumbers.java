package pandigital;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.Maths;

public class PandigitalNumbers {

	public String[] getPandigitalNumbers(){
		String[] pandigitalNumbers = new String[]{
				"0",
				"01",
				"012",
				"0123",
				"01234",
				"012345",
				"0123456",
				"01234567",
				"012345678",
				"0123456789"
		};
		return pandigitalNumbers;
	}

	public boolean isPandigital(BigInteger n){
		String sortedNumber = Maths.sortString(n);
		String[] pandigitalNumbers = this.getPandigitalNumbers();

		if(Arrays.asList(pandigitalNumbers).contains(sortedNumber)){
			return true;
		}
		return false;
	}

	public List<BigInteger> getPandigitalsWithProperty(BigInteger n){
		List<BigInteger> pandigitalsWithProperty = new ArrayList<>();
		for(BigInteger i = BigInteger.valueOf(1406357289); (i.compareTo(n) == -1); i = i.add(BigInteger.ONE)){
			if(isPandigital(i)){
				if(Maths.checkProperty(String.valueOf(i))){
					pandigitalsWithProperty.add(i);
				}
			}
		}
		System.out.println("The list of pandigital numbers satisfying the property " + pandigitalsWithProperty);
		return pandigitalsWithProperty;
	}

}
