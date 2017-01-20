package findnumber;

public class CalculateNum {
	private long j = 2L;
	private long limit = 9999999999L;

	public long divisible(){
		while(j<limit){
			boolean found = true;
			for(int i=1; i<=20; i++){
				int div = (int) (j%i);
				if(div!=0){
					found = false;
					break;	
				}
			}
			if(found){
				break;
			}
			j++;
		}
		return j;
	}

}
