package fibonacci;

public class FibonacciSeries {
	private int firstNum = 0;
	private int secondNum = 1;
	private int sum = 0;
	private int nextNum =0;

	public int generateFibonacci(){
		while(nextNum<=4000000){
			nextNum = firstNum + secondNum;
			if(nextNum%2==0){
				sum +=nextNum; 
			}
			firstNum = secondNum;
			secondNum = nextNum;
			System.out.println(nextNum);
		}
		System.out.println("The sum is "+sum);
		return sum;
	}
}
