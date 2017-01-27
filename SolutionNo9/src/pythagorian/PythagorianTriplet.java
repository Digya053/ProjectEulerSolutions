package pythagorian;

public class PythagorianTriplet {
	public long product(){
		long product =1;
		for(long i=0L;i<1000L;i++){
			for(long j=0L; j<1000L; j++){
				for(long k=0L; k<1000L;k++){
					long squarei = i*i;
					long squarej = j*j;
					long squarek = k*k;
					if((i < j) && (j<k)){
						if(squarei+squarej == squarek && i+j+k ==1000L){
							System.out.println("a = "+i);
							System.out.println("b = "+j);
							System.out.println("c = "+k);

							product = i*j*k;
						}
					}
				}
			}
		}
		return product;
	}
}
