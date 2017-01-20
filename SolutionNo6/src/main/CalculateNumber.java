package main;

public class CalculateNumber {
	private int number =100;
	private int sumOfSquare;
	private int squareOfSum;

	public int sumOfSquare(){
		for(int i=1; i<=number; i++){
			sumOfSquare += i*i; 
		}
		return sumOfSquare;
	}

	public int squareOfSum(){
		int sum =0;
		for(int i=1; i<=number; i++){
			sum+= i;
		}
		squareOfSum = sum*sum;
		return squareOfSum;
	}
}
