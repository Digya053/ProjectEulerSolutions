package main;

import java.math.BigInteger;
import conversion.Convert;
import utils.Count;

public class MainClass {
	private static int i = 0;
	public static void main(String[] args){
		BigInteger sum = BigInteger.ZERO;
		String word;
		for(i = 1; i<=1000; i++){
			word = Convert.intoWord(i);
			sum = Count.letters(word);
		}
		i--;
		System.out.println("The sum of all the words from 1 to " +i+" is " +sum);
	}
}
