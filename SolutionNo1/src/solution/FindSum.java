package solution;

public class FindSum {
	 private int sum;

	public void findSum(){

		for (int i=0;i<1000;i++){
			if(i%3!=0 && i%5!=0){
				continue;

			}
			sum+=i;
		}

		System.out.println("The sum is "+sum);
	}
}
