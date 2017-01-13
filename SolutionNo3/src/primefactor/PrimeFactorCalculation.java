package primefactor;

import java.math.*;

public class PrimeFactorCalculation {
	PrimeFactor pf = new PrimeFactor();
	private  long count=1L;
	private long factorProduct=1L;

	public void calculate(){
		System.out.println("The prime factors are ");
		for (count=2L; count<600851475143L; count++){
			boolean primeNo =pf.checkPrime(count);
			if(primeNo == true){
				if(600851475143L%count == 0){
					System.out.print(count+ "   ");
					factorProduct*=count;
					if(factorProduct == 600851475143L){
						System.out.println("");
						System.out.println("The largest prime factor is "+count);
						break;
					}
				}
			}
		}
	}
}



