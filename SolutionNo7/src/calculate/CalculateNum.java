package calculate;

public class CalculateNum {
	private String prime ="2";
	private int count =1;

	public void calculatePrime(long n, int position){
		boolean number = true;

		for(int i=3; i<n;i+=2){
			for(int j =3; j<n; j++){
				if(i!=j){
					if(i%j==0){
						number =false;
						break;
					}
					else{
						prime +=" " +i;
						count++;
						if(count == position){
							System.out.println("The prime number at position "+position+" is "+prime.length());
						}
						break;
					}

				}
			}
		}
		System.out.println("All the prime numbers upto the position are "+prime);
		System.out.println("The count is "+count);
	}

}


