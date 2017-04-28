package main;

import series.Series;
import java.math.BigInteger;

public class MainClass {
	
	public static void main(String[] args){
		
		Series series = new Series();
		BigInteger sum = series.solve(1000);
		System.out.println("The sum of the series is " + sum);
		String lastTenDigits = series.getLastTenDigits(sum);
		System.out.println("The last ten digits are " + lastTenDigits);
	}

}
